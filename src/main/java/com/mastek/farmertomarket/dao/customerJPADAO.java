package com.mastek.farmertomarket.dao;

import org.springframework.data.repository.CrudRepository;

import com.mastek.farmertomarket.entities.customer;

public interface customerJPADAO extends CrudRepository<customer, Integer>{

}
