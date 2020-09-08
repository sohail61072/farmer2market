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
@Table(name="order")
public class order {
	
	@Id												    // Marking the property as primary key for the table 
	@Column(name="orderID")							// using column to provide the default column name
	@GeneratedValue(strategy=GenerationType.AUTO)

	@FormParam("orderID")
	int orderID;
	
	@FormParam("deliveryDate")
	String deliveryDate; 
	
	@FormParam("totalCost")
	double totalCost;

	public int getOrderID() {
		return orderID;
	}

	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}

	public String getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public double getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}

	@Override
	public String toString() {
		return "order [orderID=" + orderID + ", deliveryDate=" + deliveryDate + ", totalCost=" + totalCost + "]";
	}
	
	

}
