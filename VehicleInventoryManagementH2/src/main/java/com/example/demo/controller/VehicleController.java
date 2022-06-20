//Written by Jared Hall 6/18/2022

package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

//import org.springframework.beans.factory.annotation.Autowired;



import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.model.Vehicle;
import com.example.demo.service.VehicleService;
//RESTful APIs for CRUD functionality 
@RestController //defines as controller class 
@RequestMapping("/vehiclemanagement") //used to identify particular controller and url
public class VehicleController {
	@Autowired 
	//provide instance of VehicleService and use it to access methods defined inside VehicleServiceImpl class
	private VehicleService vehicleService;
	//call getAllVehicleDetails() method defined inside  VehicleServiceImpl class get details of all vehicles in repository
	@GetMapping(value = "/vehicles")
	public List<Vehicle> getAllVehicles() throws Exception{	
		//return all vehicle details from database
		return vehicleService.getAllVehicleDetails();
	}
	
	@GetMapping(value = "/vehicles/{vehicleId}") //@Path variable used to get vehicleId key from browser input in url
	public Vehicle getVehicle(@PathVariable("vehicleId") Integer vehicleId) throws Exception{
		//return vehicle details based on key
		return vehicleService.getVehicle(vehicleId);
	}
	//
	@PostMapping(value = "/vehicles")//used to handle post request from external source, path used to identify post request
	//pass details in the body of the request 
	public Integer addVehicle(@RequestBody Vehicle vehicle) throws Exception{
		 // call saveOrUpdate() Method of the VehicleServicImpl class which updates h2 database table for vehicle specified by changing the id field in the body	
		return vehicleService.saveOrUpdate(vehicle);
	}
	
	
	//Delete API for deleting vehicle
	@DeleteMapping(value = "/vehicles/{vehicleId}")//specify vehicle Id in the url to delete specific vehicle from h2 database table
	public void deleteVehicle(@PathVariable int vehicleId) throws Exception{
		vehicleService.delete(vehicleId); // call delete() method of vehicleServiceImpl class
		
		
	}

	
}
