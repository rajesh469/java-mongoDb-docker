package com.car.rental.objects;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("User")
public class User implements Serializable{
	
	/**
	 * @author RAJESH Thadavena
	 */
	private static final long serialVersionUID = 1L;

	private String userName;
	
	@Id
	private String userId;
	
	private Integer mobile;
	
	private String address;   
	
	List<CarDetails> carsList;

	public User(String userName, String userId, Integer mobile, String address, List<CarDetails> carsList) {
		super();
		this.userName = userName;
		this.userId = userId;
		this.mobile = mobile;
		this.address = address;
		this.carsList = carsList;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Integer getMobile() {
		return mobile;
	}

	public void setMobile(Integer mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<CarDetails> getCarsList() {
		return carsList;
	}

	public void setCarsList(List<CarDetails> carsList) {
		this.carsList = carsList;
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", userId=" + userId + ", mobile=" + mobile + ", address=" + address
				+ ", carsList=" + carsList + "]";
	}

 
}
