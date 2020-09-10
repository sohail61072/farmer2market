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
@Table(name="ftom_transaction")
public class Transaction {
	
	
	@FormParam("transactionID")
	int transactionID;
	
	@FormParam("transactionDate")
	String transactionDate;
	
	@FormParam("transactionAmount")
	double transactionAmount;

	@Id												    // Marking the property as primary key for the table 
	@Column(name="transactionID")							// using column to provide the default column name
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getTransactionID() {
		return transactionID;
	}

	public void setTransactionID(int transactionID) {
		this.transactionID = transactionID;
	}

	public String getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}

	public double getTransactionAmount() {
		return transactionAmount;
	}

	public void setTransactionAmount(double transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	@Override
	public String toString() {
		return "transaction [transactionID=" + transactionID + ", transactionDate=" + transactionDate
				+ ", transactionAmount=" + transactionAmount + "]";
	}
	
	

}
