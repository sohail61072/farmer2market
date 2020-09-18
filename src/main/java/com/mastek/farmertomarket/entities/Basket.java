package com.mastek.farmertomarket.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.ws.rs.FormParam;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import org.springframework.data.annotation.Transient;

@XmlRootElement
@Entity 												// declares the class as entity, to be managed by JPA
@Table(name="ftom_basket")
public class Basket {

//	a
	
	
	@FormParam("basketID")
	int basketID;
	
	@FormParam("basketAmount")
	int basketAmount;
	
	Set<Item> itemsAssigned = new HashSet<>();

	
	@ManyToMany(cascade=CascadeType.ALL) // configure many to many association for entities
	@JoinTable(name="ftom_Basket_Items",  // provide the join table name
			joinColumns= {@JoinColumn(name="fk_basketID")}, 
			inverseJoinColumns = {@JoinColumn(name="fk_itemId")} // foreign key column for collection type
			)
	@Transient // ignore this property when storing employee data in MongoDB
	@XmlTransient // ignore the association property when shared via Service
	public Set<Item> getItemsAssigned() {
		return itemsAssigned;
	}

	public void setItemsAssigned(Set<Item> itemsAssigned) {
		this.itemsAssigned = itemsAssigned;
	}

	
	@Id												    // Marking the property as primary key for the table 
	@Column(name="basketID")							// using column to provide the default column name
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getBasketID() {
		return basketID;
	}

	public void setBasketID(int basketID) {
		this.basketID = basketID;
	}
	

	public int getBasketAmount() {
		return basketAmount;
	}

	public void setBasketAmount(int basketAmount) {
		this.basketAmount = basketAmount;
	}

	@Override
	public String toString() {
		return "basket [basketID=" + basketID + "]";
	}
	
}
