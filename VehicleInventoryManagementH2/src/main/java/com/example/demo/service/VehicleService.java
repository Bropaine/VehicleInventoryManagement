//Written by Jared Hall 6/18/2022

package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Vehicle;

//Empty body methods that are invoked by controller
public interface VehicleService  {
	
	public List<Vehicle> getAllVehicleDetails()  throws Exception;
	
	public Vehicle getVehicle(Integer vehicleId) throws Exception;
	
	public Integer saveOrUpdate(Vehicle vehicle)throws Exception;

	public void delete(Integer vehicleId) throws Exception;
	
	

	

	
	

}

