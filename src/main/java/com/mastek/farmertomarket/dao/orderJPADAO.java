package com.mastek.farmertomarket.dao;

import org.springframework.data.repository.CrudRepository;

import com.mastek.farmertomarket.entities.order;

public interface orderJPADAO extends CrudRepository<order, Integer>{

}
