package org.praveenmk.microservice.learn.ratingdetailsservice.controller;

import org.praveenmk.microservice.learn.ratingdetailsservice.model.UserRating;
import org.praveenmk.microservice.learn.ratingdetailsservice.service.RatingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RatingServiceController {

    @Autowired
    private RatingServiceImpl ratingService;

    @RequestMapping(value = "/jparating/getrating/user/{userId}",method = RequestMethod.GET)
    public List<UserRating> getMoiveRatingOfUser(@PathVariable(value = "userId") long userId) {
        return ratingService.getAllRatingByUserId(userId);
    }


    @RequestMapping(value = "/jparating/getrating/movie/{movieId}", method = RequestMethod.GET)
    public List<UserRating> getUsersRatingForMovie(@PathVariable(value = "movieId") long movieId) {
        return ratingService.getAllRatingByMovieId(movieId);
    }

    @RequestMapping(value = "/jparating/getrating", method = RequestMethod.GET)
    public List<UserRating> getAllUsersRating() {
        return ratingService.getAllRatings();
    }


}
