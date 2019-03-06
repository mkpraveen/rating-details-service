package org.praveenmk.microservice.learn.ratingdetailsservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class UserRating {

    @Id
    @GeneratedValue
    private long userRatingId;

    private long userId;
    private long movieId;
    private int ratingNumber;
    private String ratingComments;

    public UserRating() {
    }

    public UserRating(long userId, long movieId, int ratingNumber, String ratingComments) {
        this.userId = userId;
        this.movieId = movieId;
        this.ratingNumber = ratingNumber;
        this.ratingComments = ratingComments;
    }

    public UserRating(long userRatingId, long userId, long movieId, int ratingNumber, String ratingComments) {
        this.userRatingId = userRatingId;
        this.userId = userId;
        this.movieId = movieId;
        this.ratingNumber = ratingNumber;
        this.ratingComments = ratingComments;
    }

    public long getUserRatingId() {
        return userRatingId;
    }

    public void setUserRatingId(long userRatingId) {
        this.userRatingId = userRatingId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getMovieId() {
        return movieId;
    }

    public void setMovieId(long movieId) {
        this.movieId = movieId;
    }

    public int getRatingNumber() {
        return ratingNumber;
    }

    public void setRatingNumber(int ratingNumber) {
        this.ratingNumber = ratingNumber;
    }

    public String getRatingComments() {
        return ratingComments;
    }

    public void setRatingComments(String ratingComments) {
        this.ratingComments = ratingComments;
    }
}
