package org.praveenmk.microservice.learn.ratingdetailsservice.service;

import org.praveenmk.microservice.learn.ratingdetailsservice.model.UserRating;
import org.praveenmk.microservice.learn.ratingdetailsservice.repository.RatingServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service("ratingService")
public class RatingServiceImpl implements RatingService {

    @Autowired
    private RatingServiceRepository ratingRepository;

    @Override
    public UserRating saveUserRating(UserRating userRating) {
        return ratingRepository.save(userRating);
    }

    @Override
    public List<UserRating> getAllRatingByUserId(long userId) {
        return ratingRepository.findAll().parallelStream().filter(userRating -> userRating.getUserId() == userId).collect(Collectors.toList());
    }

    @Override
    public List<UserRating> getAllRatingByMovieId(long movieId) {
        return ratingRepository.findAll().parallelStream().filter(userRating -> userRating.getMovieId() == movieId).collect(Collectors.toList());
    }

    @Override
    public UserRating getUserRatingByIds(long userId, long movieId) {
        return ratingRepository.findAll().parallelStream().filter(userRating -> userRating.getUserId() == userId
                && userRating.getMovieId() == movieId).collect(Collectors.toList()).get(0);
    }

    @Override
    public List<UserRating> getAllRatings() {
        return ratingRepository.findAll();
    }

    @Override
    public void deleteRating(long ratingId) {
        ratingRepository.deleteById(ratingId);
    }
}
