package com.mastek.farmertomarket.dao;

import org.springframework.data.repository.CrudRepository;

import com.mastek.farmertomarket.entities.Customer;


public interface CustomerJPADAO extends CrudRepository<Customer, Integer>{

}
