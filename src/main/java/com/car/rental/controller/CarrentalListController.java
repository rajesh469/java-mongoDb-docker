package com.car.rental.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.car.rental.objects.CarDetails;
import com.car.rental.objects.User;
import com.car.rental.repository.CarDetailsRepository;
import com.car.rental.repository.UserRegisterRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController()
@RequestMapping("/api")
public class CarrentalListController {
	
	Map bookCar = new HashMap();
	List carList = new ArrayList<CarDetails>();
	
	@Autowired
	private CarDetailsRepository carDetailsRepo;
	
	@Autowired
	private UserRegisterRepository userRegisterRepository;
	
	@GetMapping("/cardetails")
	public List<CarDetails> getCarDetails() {
		
		//returning car available list
//		CarDetails carDetails = new CarDetails(1234, "Swift", "2025", "2025", 1200,false);
//		CarDetails carDetails1 = new CarDetails(1235, "Brezza", "2024", "2024", 1400,false);
//		List carList = new ArrayList<>();
//		carList.add(carDetails);
//		carList.add(carDetails1);
		List<CarDetails> carDetails = carDetailsRepo.findAll();
		return carDetails;
	}
	@GetMapping("/searchCarCetails/{carName}")
	public List<CarDetails> searchCarDetails(@PathVariable String carName) {
		
		System.out.println("car "+carName);
		//returning car available list
		CarDetails carDetails = new CarDetails(1234, "Swift", "2025", "2025", 1200,false);
		CarDetails carDetails1 = new CarDetails(1235, "Brezza", "2024", "2024", 1400,false);
		List<CarDetails> carList = new ArrayList<CarDetails>();
		carList.add(carDetails);
		carList.add(carDetails1);
		System.out.println("carList "+carList);
		
	    List<CarDetails> carSearch = carList.stream().filter(car -> car.getCarName().equals(carName)).collect(Collectors.toList());
		System.out.println("carSearch "+carSearch);
		return carSearch;
	}
	
	@PostMapping("/bookCar")
	public CarDetails bookCar(@RequestBody CarDetails carDetails) {
		
		System.out.println("book car "+carDetails);
		//updateCarDetailsList();
		carDetailsRepo.save(carDetails);
		return carDetails;
	}
	
	@PostMapping("/registerUser")
	public User registerUser(@RequestBody User user){
		userRegisterRepository.save(user);
		System.out.println("User "+user);
		return user;
		
		
	}
	
	@GetMapping("/getUser")
	public User getUserDetails() {
		 
		CarDetails carDetails = new CarDetails(1234, "Swift", "2025", "2025", 1200,false);
		CarDetails carDetails1 = new CarDetails(1235, "Brezza", "2024", "2024", 1400,false);
		List<CarDetails> carList = new ArrayList<CarDetails>();
		carList.add(carDetails);
		carList.add(carDetails1);
		User user = new User("User1", "123", 87888812, "Hyderabad",carList);
		
		return user;
	}
	
	protected void updateCarDetailsList() {
		CarDetails carDetails = new CarDetails(121, "Swift", "2025", "2025", 1200, false);
		CarDetails carDetails1 = new CarDetails(122, "Brezza", "2025", "2025", 1450, false);
		CarDetails carDetails2 = new CarDetails(123, "XUV500", "2025", "2025", 1540, false);
		CarDetails carDetails3 = new CarDetails(124, "Thar", "2025", "2025", 1400, false);
		CarDetails carDetails4 = new CarDetails(125, "XL6", "2025", "2025", 1490, false);
		
		carList.add(carDetails);
		carList.add(carDetails1);
		carList.add(carDetails2);
		carList.add(carDetails3);
		carList.add(carDetails4);
		
	}
}
