//Written by Jared Hall 6/18/2022

package com.example.demo.dao;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Vehicle;
@Repository//defines interface as repository for manipulation of data in the h2 database
//CrudRepository contains methods for handling CRUD operations 
public interface VehicleDao extends CrudRepository<Vehicle, Integer> {
	

}
