package org.praveenmk.microservice.learn.ratingdetailsservice.exception;

public class RatingServiceException extends Exception {
    private static final long serialVersionUID = 1L;
    private String errorMessage;

    public RatingServiceException(String errorMessage) {
        super(errorMessage);
        this.errorMessage = errorMessage;

    }

    public RatingServiceException() {
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
