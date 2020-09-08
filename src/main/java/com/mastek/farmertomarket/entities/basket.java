package com.mastek.farmertomarket.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.ws.rs.FormParam;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity 												// declares the class as entity, to be managed by JPA
@Table(name="basket")
public class basket {

//	a
	@Id												    // Marking the property as primary key for the table 
	@Column(name="basketID")							// using column to provide the default column name
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	@FormParam("basketID")
	int basketID;

	public int getBasketID() {
		return basketID;
	}

	public void setBasketID(int basketID) {
		this.basketID = basketID;
	}

	@Override
	public String toString() {
		return "basket [basketID=" + basketID + "]";
	}
	
}
