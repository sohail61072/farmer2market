package com.mastek.farmertomarket.dao;

import org.springframework.data.repository.CrudRepository;

import com.mastek.farmertomarket.entities.Item;



public interface ItemJPADAO extends CrudRepository<Item, Integer>{

	// public Item findByItemName(@Param("itemName") String itemName);
}
