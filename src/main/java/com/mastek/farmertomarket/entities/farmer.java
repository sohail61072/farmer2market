package com.mastek.farmertomarket.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.ws.rs.FormParam;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity 												// declares the class as entity, to be managed by JPA
@Table(name="farmer")	
public class farmer {
	
	@FormParam("farmerID")
	int farmerID;
	
	@FormParam("farmLocation")
	String farmLocation;
	
	@FormParam("farmerForename")
	String farmerForename;
	
	@FormParam("farmerSurname")
	String farmerSurname;
	
	@FormParam("farmName")
	String farmName;
	
	@FormParam("farmType")
	farmType farmType;
	
	@FormParam("farmerUsername")
	String farmerUsername;
	
	@FormParam("farmerPassword")
	String farmerPassword;

	
	@Id												    // Marking the property as primary key for the table 
	@Column(name="farmerID")							// using column to provide the default column name
	@GeneratedValue(strategy=GenerationType.AUTO)	
	public int getFarmerID() {
		return farmerID;
	}

	public void setFarmerID(int farmerID) {
		this.farmerID = farmerID;
	}

	public String getFarmLocation() {
		return farmLocation;
	}

	public void setFarmLocation(String farmLocation) {
		this.farmLocation = farmLocation;
	}

	public String getFarmerForename() {
		return farmerForename;
	}

	public void setFarmerForename(String farmerForename) {
		this.farmerForename = farmerForename;
	}

	public String getFarmerSurname() {
		return farmerSurname;
	}

	public void setFarmerSurname(String farmerSurname) {
		this.farmerSurname = farmerSurname;
	}

	public String getFarmName() {
		return farmName;
	}

	public void setFarmName(String farmName) {
		this.farmName = farmName;
	}

	@Enumerated(EnumType.STRING)
	public farmType getFarmType() {
		return farmType;
	}

	public void setFarmType(farmType farmType) {
		this.farmType = farmType;
	}

	public String getFarmerUsername() {
		return farmerUsername;
	}

	public void setFarmerUsername(String farmerUsername) {
		this.farmerUsername = farmerUsername;
	}

	public String getFarmerPassword() {
		return farmerPassword;
	}

	public void setFarmerPassword(String farmerPassword) {
		this.farmerPassword = farmerPassword;
	}
//a
	@Override
	public String toString() {
		return "farmer [farmerID=" + farmerID + ", farmLocation=" + farmLocation + ", farmerForename=" + farmerForename
				+ ", farmerSurname=" + farmerSurname + ", farmName=" + farmName + ", farmType=" + farmType
				+ ", farmerUsername=" + farmerUsername + ", farmerPassword=" + farmerPassword + "]";
	}
	
	

}
