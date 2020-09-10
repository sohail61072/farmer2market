package com.mastek.farmertomarket.dao;

import org.springframework.data.repository.CrudRepository;

import com.mastek.farmertomarket.entities.Product;


public interface ProductJPADAO extends CrudRepository<Product, Integer>{

}
