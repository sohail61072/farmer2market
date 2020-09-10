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
@Table(name="ftom_product")
public class Product {
 
	
	
	@FormParam("productID")
	int productID;
	
	@FormParam("productName")
	String productName;
	
	@FormParam("productType")
	ProductType productType;
	
	@FormParam("productDescription")
	String productDescription;
	
	@FormParam("productPrice")
	double productPrice;
	
	@FormParam("productQuantity")
	int productQuantity;
	
	@FormParam("productWeightKG")
	double productWeightKG;

	@Id												    // Marking the property as primary key for the table 
	@Column(name="productID")							// using column to provide the default column name
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	@Enumerated(EnumType.STRING)
	public ProductType getProductType() {
		return productType;
	}

	public void setProductType(ProductType productType) {
		this.productType = productType;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public int getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}

	public double getProductWeightKG() {
		return productWeightKG;
	}

	public void setProductWeightKG(double productWeightKG) {
		this.productWeightKG = productWeightKG;
	}

	@Override
	public String toString() {
		return "product [productID=" + productID + ", productName=" + productName + ", productType=" + productType
				+ ", productDescription=" + productDescription + ", productPrice=" + productPrice + ", productQuantity="
				+ productQuantity + ", productWeightKG=" + productWeightKG + "]";
	}
	
	
}
