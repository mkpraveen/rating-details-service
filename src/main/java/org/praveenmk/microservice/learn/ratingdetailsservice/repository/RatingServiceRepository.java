package org.praveenmk.microservice.learn.ratingdetailsservice.repository;

import org.praveenmk.microservice.learn.ratingdetailsservice.model.UserRating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("ratingRepository")
public interface RatingServiceRepository extends JpaRepository<UserRating, Long> {
}
