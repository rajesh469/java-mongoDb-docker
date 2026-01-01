package com.car.rental.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.car.rental.objects.CarDetails;

public interface CarDetailsRepository extends MongoRepository<CarDetails, Integer>{

}
