package com.mastek.farmertomarket.dao;

import org.springframework.data.repository.CrudRepository;

import com.mastek.farmertomarket.entities.Checkout;


public interface CheckoutJPADAO extends CrudRepository<Checkout, Integer> {

}
