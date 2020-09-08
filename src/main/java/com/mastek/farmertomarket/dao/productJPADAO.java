package com.mastek.farmertomarket.dao;

import org.springframework.data.repository.CrudRepository;

import com.mastek.farmertomarket.entities.product;

public interface productJPADAO extends CrudRepository<product, Integer>{

}
