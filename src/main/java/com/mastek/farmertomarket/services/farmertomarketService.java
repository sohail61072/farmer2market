package com.mastek.farmertomarket.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.mastek.farmertomarket.apis.basketAPI;
import com.mastek.farmertomarket.apis.checkoutAPI;
import com.mastek.farmertomarket.apis.customerAPI;
import com.mastek.farmertomarket.apis.farmerAPI;
import com.mastek.farmertomarket.apis.itemAPI;
import com.mastek.farmertomarket.apis.orderAPI;
import com.mastek.farmertomarket.apis.productAPI;
import com.mastek.farmertomarket.apis.transactionAPI;
import com.mastek.farmertomarket.dao.basketJPADAO;
import com.mastek.farmertomarket.dao.checkoutJPADAO;
import com.mastek.farmertomarket.dao.customerJPADAO;
import com.mastek.farmertomarket.dao.farmerJPADAO;
import com.mastek.farmertomarket.dao.itemJPADAO;
import com.mastek.farmertomarket.dao.orderJPADAO;
import com.mastek.farmertomarket.dao.productJPADAO;
import com.mastek.farmertomarket.dao.transactionJPADAO;
import com.mastek.farmertomarket.entities.basket;
import com.mastek.farmertomarket.entities.checkout;
import com.mastek.farmertomarket.entities.customer;
import com.mastek.farmertomarket.entities.farmer;
import com.mastek.farmertomarket.entities.item;
import com.mastek.farmertomarket.entities.order;
import com.mastek.farmertomarket.entities.product;
import com.mastek.farmertomarket.entities.transaction;


@Component									 // marking class as bean to be created
@Scope("singleton")	// singleton: One object used across test cases, prototype: one object per request
public class farmertomarketService implements basketAPI, checkoutAPI, customerAPI, farmerAPI, itemAPI, orderAPI, productAPI, transactionAPI{

@Autowired
basketJPADAO baskDAO;

@Autowired
checkoutJPADAO checkDAO;

@Autowired
customerJPADAO custDAO;

@Autowired
farmerJPADAO farmDAO;

@Autowired
itemJPADAO itemDAO;

@Autowired
orderJPADAO ordDAO;

@Autowired
productJPADAO prodDAO;

@Autowired
transactionJPADAO tranDAO;


@Override
public Iterable<transaction> listAllTransactions() {
	// TODO Auto-generated method stub
	return tranDAO.findAll();
}

@Override
public transaction findTransactionID(int transactionID) {
	// TODO Auto-generated method stub
	return tranDAO.findById(transactionID).get();
}

@Override
public transaction registerNewTransaction(transaction newTransaction) {
	newTransaction = tranDAO.save(findTransactionID(0));
	return newTransaction;
}

@Override
public Iterable<product> listAllProducts() {
	// TODO Auto-generated method stub
	return prodDAO.findAll();
}

@Override
public product findProductID(int productID) {
	// TODO Auto-generated method stub
	return prodDAO.findById(productID).get();
}

@Override
public product registerNewProduct(product newProduct) {
	// TODO Auto-generated method stub
	return newProduct;
}

@Override
public Iterable<order> listAllOrders() {
	// TODO Auto-generated method stub
	return ordDAO.findAll();
}

@Override
public order findOrderID(int orderID) {
	// TODO Auto-generated method stub
	return ordDAO.findById(orderID).get();
}

@Override
public order registerNewOrder(order newOrder) {
	// TODO Auto-generated method stub
	return newOrder;
}

@Override
public Iterable<item> listAllItems() {
	// TODO Auto-generated method stub
	return itemDAO.findAll();
}

@Override
public item finditemID(int itemID) {
	// TODO Auto-generated method stub
	return itemDAO.findById(itemID).get();
}

@Override
public item registerNewBasket(item newItem) {
	// TODO Auto-generated method stub
	return newItem;
}

@Override
public Iterable<farmer> listAllFarmers() {
	// TODO Auto-generated method stub
	return farmDAO.findAll();
}

@Override
public farmer findFarmerID(int farmerID) {
	// TODO Auto-generated method stub
	return farmDAO.findById(farmerID).get();
}

@Override
public farmer registerNewFarmer(farmer newFarmer) {
	// TODO Auto-generated method stub
	return newFarmer;
}

@Override
public Iterable<customer> listAllCustomers() {
	// TODO Auto-generated method stub
	return custDAO.findAll();
}

@Override
public customer findCustomerID(int customerID) {
	// TODO Auto-generated method stub
	return custDAO.findById(customerID).get();
}

@Override
public customer registerNewCustomer(customer newCustomer) {
	return newCustomer;
}

@Override
public Iterable<checkout> listAllCheckouts() {
	System.out.println("List all checkouts");
	return checkDAO.findAll();
}

@Override
public checkout findCheckoutID(int checkoutID) {
	// TODO Auto-generated method stub
	return checkDAO.findById(checkoutID).get();
}

@Override
public checkout registerNewCheckout(checkout newCheckout) {
	// TODO Auto-generated method stub
	return newCheckout;
}

@Override
public Iterable<basket> listAllBaskets() {
	// TODO Auto-generated method stub
	return baskDAO.findAll();
}

@Override
public basket findBasketID(int basketID) {
	// TODO Auto-generated method stub
	return baskDAO.findById(basketID).get();
}

@Override
public basket registerNewBasket(basket newBasket) {
	// TODO Auto-generated method stub
	return newBasket;
}


}
						 