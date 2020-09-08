package com.mastek.farmertomarket.dao;

import org.springframework.data.repository.CrudRepository;

import com.mastek.farmertomarket.entities.farmer;

public interface farmerJPADAO extends CrudRepository<farmer, Integer> {

}
