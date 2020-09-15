package com.mastek.farmertomarket.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.ws.rs.FormParam;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement
@Entity 												// declares the class as entity, to be managed by JPA
@Table(name="ftom_checkout")
public class Checkout {

	
	int checkoutID;
	
	@FormParam("deliveryDate")
	String deliveryDate;
	
	@FormParam("totalCost")
	double totalCost;
	
	Set<Customer> team = new HashSet<>();
	
	// associates the many entity using collection with cascade enabled
	// specify in mappedBy the @JoinColumn config property name
	
	@OneToMany(mappedBy="currentCheckout", cascade=CascadeType.ALL)
	@XmlTransient
	public Set<Customer> getTeam() {
		return team;
	}

	public void setTeam(Set<Customer> team) {
		this.team = team;
	}
	
	Transaction Transaction;
	
	@OneToOne(fetch=FetchType.EAGER)
	@XmlTransient
	@JoinColumn(name="transactionID")
	public Transaction getTransaction() {
		return Transaction;
	}

	public void setTransaction(Transaction transaction) {
		this.Transaction = transaction;
	}
	
	
	@Id												    // Marking the property as primary key for the table 
	@Column(name="checkoutID")							// using column to provide the default column name
	@GeneratedValue(strategy=GenerationType.AUTO)
	@FormParam("checkoutID")
	public int getCheckoutID() {
		return checkoutID;
	}


	public void setCheckoutID(int checkoutID) {
		this.checkoutID = checkoutID;
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
		return "checkout [checkoutID=" + checkoutID + ", deliveryDate=" + deliveryDate + ", totalCost=" + totalCost
				+ "]";
	}
	
	
}
