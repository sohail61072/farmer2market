package com.mastek.farmertomarket.dao;

import org.springframework.data.repository.CrudRepository;

import com.mastek.farmertomarket.entities.Farmer;



public interface FarmerJPADAO extends CrudRepository<Farmer, Integer> {

}
