package com.car.rental.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.car.rental.objects.User;

public interface UserRegisterRepository extends MongoRepository<User, String>{

}
