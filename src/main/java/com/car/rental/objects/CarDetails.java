package com.car.rental.objects;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("CarDetails")
public class CarDetails implements Serializable {

	/**
	 * Rajesh Thadavena
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private Integer carId;
	
	private String carName;
	
	private String purchaseDate;
	
	private String carModel;
	
	private Integer carCC;
	
	private Boolean booked;         

	public CarDetails(Integer carId, String carName, String purchaseDate, String carModel, Integer carCC,
			Boolean booked) {
		super();
		this.carId = carId;
		this.carName = carName;
		this.purchaseDate = purchaseDate;
		this.carModel = carModel;
		this.carCC = carCC;
		this.booked = booked;
	}

	public Integer getCarId() {
		return carId;
	}

	public void setCarId(Integer carId) {
		this.carId = carId;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(String purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public Integer getCarCC() {
		return carCC;
	}

	public void setCarCC(Integer carCC) {
		this.carCC = carCC;
	}
	
	public Boolean getBooked() {
		return booked;
	}

	public void setBooked(Boolean booked) {
		this.booked = booked;
	}

	@Override
	public String toString() {
		return "CarDetails [carId=" + carId + ", carName=" + carName + ", purchaseDate=" + purchaseDate + ", carModel="
				+ carModel + ", carCC=" + carCC + ", booked=" + booked + "]";
	}
	
}
