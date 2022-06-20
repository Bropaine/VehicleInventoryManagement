//Written by Jared Hall 6/18/2022

package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//Vehicle Class in the model package allows for data manipulation
@Entity
@Table//link to database
public class Vehicle {
	@Id//vehicle_id is the primary key of the table
	//private variables for data encapsulation
	//create columns in database for each parameter
	//each field is linked to a column
	@Column(name = "vehicle_id")
	private Integer vehicleId;
	@Column(name = "vehicle_model")
	private String vehicleModel;
	@Column(name = "vehicle_make")
	private String vehicleMake;
	@Column(name = "vehicle_year")
	private String vehicleYear;
	@Column(name = "vehicle_color")
	private String vehicleColor;
	@Column(name = "vehicle_milage")
	private String vehicleMilage;
	
	

	//getters and setters for vehicle attributes because they are private
	public Integer getVehicleId() {
		return vehicleId;
	}
	
	public void setVehicleId(Integer vehicleId) {
		this.vehicleId = vehicleId;
	} 
	public String getVehicleModel() {
		return vehicleModel;
	}
	
	public void setVehicleModel(String vehicleModel) {
		this.vehicleModel = vehicleModel;
	} 
	public String getVehicleMake() {
		return vehicleMake;
	}
	
	public void setVehicleMake(String vehicleMake) {
		this.vehicleMake = vehicleMake;
	} 
	public String getVehicleYear() {
		return vehicleYear;
	}
	
	public void setVehicleYear(String vehicleYear) {
		this.vehicleYear = vehicleYear;
	} 
	public String getVehicleColor() {
		return vehicleColor;
	}
	
	public void setVehicleColor(String vehicleColor) {
		this.vehicleColor = vehicleColor;
	} 
	public String getVehicleMilage() {
		return vehicleMilage;
	}
	
	public void setVehicleMileage(String vehicleMilage) {
		this.vehicleMilage = vehicleMilage;
	}

	

	
}

