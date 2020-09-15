package com.mastek.farmertomarket.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.ws.rs.FormParam;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import org.springframework.data.annotation.Transient;

@XmlRootElement
@Entity 												// declares the class as entity, to be managed by JPA
@Table(name="ftom_customer")
public class Customer {
	
	
	

	@FormParam("customerID")
	int customerID;
	
	@FormParam("customerForename")
	String customerForename;
	
	@FormParam("customerSurname")
	String customerSurname;
	
	@FormParam("customerAddress")
	String customerAddress;
	
	@FormParam("customerBalance")
	double customerBalance;
	
	@FormParam("customerDOB")
	String customerDOB;
	
	@FormParam("customerUsername")
	String customerUsername;
	
	@FormParam("customerPassword")
	String customerPassword;

	Checkout currentCheckout;
	
	
	@ManyToOne //one customer can have multiple checkouts 
	@JoinColumn(name="fk_checkoutID")  //the foreign key column to store the associate checkoutID
	@Transient // ignore this property when storing employee data in MongoDB
	@XmlTransient // ignore the association property when shared via Service
	
	public Checkout getCurrentCheckout() {
		return currentCheckout;
	}

	public void setCurrentCheckout(Checkout currentCheckout) {
		this.currentCheckout = currentCheckout;
	}

	@Id												    // Marking the property as primary key for the table 
	@Column(name="customerID")							// using column to provide the default column name
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerForename() {
		return customerForename;
	}

	public void setCustomerForename(String customerForename) {
		this.customerForename = customerForename;
	}

	public String getCustomerSurname() {
		return customerSurname;
	}

	public void setCustomerSurname(String customerSurname) {
		this.customerSurname = customerSurname;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public double getCustomerBalance() {
		return customerBalance;
	}

	public void setCustomerBalance(double customerBalance) {
		this.customerBalance = customerBalance;
	}

	public String getCustomerDOB() {
		return customerDOB;
	}

	public void setCustomerDOB(String customerDOB) {
		this.customerDOB = customerDOB;
	}

	public String getCustomerUsername() {
		return customerUsername;
	}

	public void setCustomerUsername(String customerUsername) {
		this.customerUsername = customerUsername;
	}

	public String getCustomerPassword() {
		return customerPassword;
	}

	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}

	@Override
	public String toString() {
		return "customer [customerID=" + customerID + ", customerForename=" + customerForename + ", customerSurname="
				+ customerSurname + ", customerAddress=" + customerAddress + ", customerBalance=" + customerBalance
				+ ", customerDOB=" + customerDOB + ", customerUsername=" + customerUsername + ", customerPassword="
				+ customerPassword + "]";
	}
	
	
	

}
