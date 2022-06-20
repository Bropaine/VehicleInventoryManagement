//Written by Jared Hall 6/18/2022

package com.example.demo.service;


import java.util.ArrayList;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.demo.dao.VehicleDao;

import com.example.demo.model.Vehicle;

@Service //defines as service class

public class VehicleServiceImpl implements VehicleService {
	
	@Autowired //used to inject dependencies
	

	 VehicleDao vehicleDao;

	@Override
	//implementation of getAllVehicleDetails() method

	public List<Vehicle> getAllVehicleDetails() throws Exception{
		List<Vehicle> vehiclesList = new ArrayList<>();
		vehicleDao.findAll().forEach((vehicle) -> vehiclesList.add(vehicle));
		
		return vehiclesList;
	}
	
	
		
	@Override
	//Implementation ofgetVehicle() method
	public Vehicle getVehicle(Integer vehicleId)  throws Exception{
	
		return vehicleDao.findById(vehicleId).get();
	}
	
	
	@Override
	public void delete(Integer vehicleId) throws Exception {
			
			// remove vehicle from table
			vehicleDao.deleteById(vehicleId);
		
	}



	@Override
	public Integer saveOrUpdate(Vehicle vehicle)  throws Exception {
		//saves to table or updates vehicle information
		return vehicleDao.save(vehicle).getVehicleId();
	}


}
