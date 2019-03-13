package org.praveenmk.microservice.learn.ratingdetailsservice;

import org.praveenmk.microservice.learn.ratingdetailsservice.model.UserRating;
import org.praveenmk.microservice.learn.ratingdetailsservice.repository.RatingServiceRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
public class RatingDetailsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RatingDetailsServiceApplication.class, args);
	}

	@Bean
	public CommandLineRunner setup(RatingServiceRepository ratingRepository) {
		return (args -> {
			ratingRepository.save(new UserRating(1, 1, 10, "Movie Rating to 10 for Movie 1, User 1"));
			ratingRepository.save(new UserRating(1, 2, 5, "Movie Rating to 5 for Movie 2, User 1"));
			ratingRepository.save(new UserRating(2, 1, 10, "Movie Rating to 10 for Movie 1, User 2"));
			ratingRepository.save(new UserRating(2, 2, 5, "Movie Rating to 5 for Movie 2, User 2"));
		});

	}
}
