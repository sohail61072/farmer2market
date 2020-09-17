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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.ws.rs.FormParam;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement
@Entity 												// declares the class as entity, to be managed by JPA
@Table(name="ftom_item")
public class Item {
	
		
	@FormParam("itemID")
	int itemID;
	
	@FormParam("itemName")
	String itemName;
	
	@FormParam("itemQuantity")
	double itemQuantity;
	
	@FormParam("itemPrice")
	double itemPrice;
	
	Set<Basket> basketItems= new HashSet<>();
	
	//provide the property in Item with @ManyToMany and @JoinTable configurations
	@ManyToMany(mappedBy="itemsAssigned")
	@XmlTransient
	public Set<Basket> getBasketItems() {
		return basketItems;
	}

	public void setBasketItems(Set<Basket> basketItems) {
		this.basketItems = basketItems;
	}

	Set<Item> customerItems = new HashSet<>();

	@ManyToMany(cascade = CascadeType.ALL) // configure many to many association for entities
	@JoinTable(name = "ftom_Customer_Items", // provide the join table name
			joinColumns = { @JoinColumn(name = "fk_itemID") }, inverseJoinColumns = {
					@JoinColumn(name = "fk_customerId") }) // foreign key column for collection type
	public Set<Item> getCustomerItems() {
		return customerItems;
	}

	public void setCustomerItems(Set<Item> customerItems) {
		this.customerItems = customerItems;
	}

	Product Product;
	


	@OneToOne(fetch=FetchType.EAGER)
	@XmlTransient
	@JoinColumn(name="productID")
	public Product getProduct() {
		return Product;
	}

	public void setProduct(Product product) {
		this.Product = product;
	}
	
	@Id												    // Marking the property as primary key for the table 
	@Column(name="itemID")							// using column to provide the default column name
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getItemID() {
		return itemID;
	}


	public void setItemID(int itemID) {
		this.itemID = itemID;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double getItemQuantity() {
		return itemQuantity;
	}

	public void setItemQuantity(double itemQuantity) {
		this.itemQuantity = itemQuantity;
	}

	public double getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}

	@Override
	public String toString() {
		return "item [itemID=" + itemID + ", itemName=" + itemName + ", itemQuantity=" + itemQuantity + ", itemPrice="
				+ itemPrice + "]";
	}
	
	

}
