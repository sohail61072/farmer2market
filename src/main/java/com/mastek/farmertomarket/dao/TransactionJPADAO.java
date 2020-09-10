package com.mastek.farmertomarket.dao;

import org.springframework.data.repository.CrudRepository;

import com.mastek.farmertomarket.entities.Transaction;



public interface TransactionJPADAO extends CrudRepository<Transaction, Integer>{

}
