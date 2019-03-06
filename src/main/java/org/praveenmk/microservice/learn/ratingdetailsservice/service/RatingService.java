package org.praveenmk.microservice.learn.ratingdetailsservice.service;

import org.praveenmk.microservice.learn.ratingdetailsservice.model.UserRating;

import java.util.List;

public interface RatingService {
    UserRating saveUserRating(UserRating userRating);
    List<UserRating> getAllRatingByUserId(long userId);
    List<UserRating> getAllRatingByMovieId(long movieId);
    UserRating getUserRatingByIds(long userId, long movieId);
    List<UserRating> getAllRatings();
    void deleteRating(long ratingId);

}
