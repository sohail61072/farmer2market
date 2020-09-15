package com.mastek.farmertomarket.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.mastek.farmertomarket.apis.BasketAPI;
import com.mastek.farmertomarket.apis.CheckoutAPI;
import com.mastek.farmertomarket.apis.CustomerAPI;
import com.mastek.farmertomarket.apis.FarmerAPI;
import com.mastek.farmertomarket.apis.ItemAPI;
import com.mastek.farmertomarket.apis.ProductAPI;
import com.mastek.farmertomarket.apis.TransactionAPI;
import com.mastek.farmertomarket.dao.BasketJPADAO;
import com.mastek.farmertomarket.dao.CheckoutJPADAO;
import com.mastek.farmertomarket.dao.CustomerJPADAO;
import com.mastek.farmertomarket.dao.FarmerJPADAO;
import com.mastek.farmertomarket.dao.ItemJPADAO;
import com.mastek.farmertomarket.dao.ProductJPADAO;
import com.mastek.farmertomarket.dao.TransactionJPADAO;
import com.mastek.farmertomarket.entities.Basket;
import com.mastek.farmertomarket.entities.Checkout;
import com.mastek.farmertomarket.entities.Customer;
import com.mastek.farmertomarket.entities.Farmer;
import com.mastek.farmertomarket.entities.Item;
import com.mastek.farmertomarket.entities.Product;
import com.mastek.farmertomarket.entities.Transaction;


@Component									 // marking class as bean to be created
@Scope("singleton")	// singleton: One object used across test cases, prototype: one object per request
public class FarmerToMarketService implements BasketAPI, CheckoutAPI, CustomerAPI, FarmerAPI, ItemAPI, ProductAPI, TransactionAPI{

@Autowired
BasketJPADAO baskDAO;

@Autowired
CheckoutJPADAO checkDAO;

@Autowired
CustomerJPADAO custDAO;

@Autowired
FarmerJPADAO farmDAO;

@Autowired
ItemJPADAO itemDAO;

@Autowired
ProductJPADAO prodDAO;

@Autowired
TransactionJPADAO tranDAO;


@Override
public Iterable<Transaction> listAllTransactions() {
	// TODO Auto-generated method stub
	return tranDAO.findAll();
}

@Override
public Transaction findTransactionID(int transactionID) {
	// TODO Auto-generated method stub
	return tranDAO.findById(transactionID).get();
}

@Override
public Transaction registerNewTransaction(Transaction newTransaction) {
	newTransaction = tranDAO.save(newTransaction);
	return newTransaction;
}

@Override
public Iterable<Product> listAllProducts() {
	// TODO Auto-generated method stub
	return prodDAO.findAll();
}

@Override
public Product findProductID(int productID) {
	// TODO Auto-generated method stub
	return prodDAO.findById(productID).get();
}

@Override
public Product registerNewProduct(Product newProduct) {
	newProduct=prodDAO.save(newProduct);
	return newProduct;
}

@Override
public Iterable<Item> listAllItems() {
	// TODO Auto-generated method stub
	return itemDAO.findAll();
}

@Override
public Item finditemID(int itemID) {
	// TODO Auto-generated method stub
	return itemDAO.findById(itemID).get();
}

@Override
public Item registerNewItem(Item newItem) {
	newItem = itemDAO.save(newItem);
	return newItem;
}




@Override
public Iterable<Customer> listAllCustomers() {
	// TODO Auto-generated method stub
	return custDAO.findAll();
}

@Override
public Customer findCustomerID(int customerID) {
	// TODO Auto-generated method stub
	return custDAO.findById(customerID).get();
}

@Override
public Customer registerNewCustomer(Customer newCustomer) {
	newCustomer = custDAO.save(newCustomer);
	return newCustomer;
}

@Override
public Iterable<Checkout> listAllCheckouts() {
	System.out.println("List all checkouts");
	return checkDAO.findAll();
}

@Override
public Checkout findCheckoutID(int checkoutID) {
	// TODO Auto-generated method stub
	return checkDAO.findById(checkoutID).get();
}

@Override
public Checkout registerNewCheckout(Checkout newCheckout) {
	newCheckout = checkDAO.save(newCheckout);
	return newCheckout;
}

@Override
public Iterable<Basket> listAllBaskets() {
	// TODO Auto-generated method stub
	return baskDAO.findAll();
}

@Override
public Basket findBasketID(int basketID) {
	// TODO Auto-generated method stub
	return baskDAO.findById(basketID).get();
}

@Override
public Basket registerNewBasket(Basket newBasket) {
	newBasket = baskDAO.save(newBasket);
	return newBasket;
}

@Override
public Farmer registerNewFarmer(Farmer newFarmer) {
	newFarmer = farmDAO.save(newFarmer);
	return newFarmer;
}

@Override
public Iterable<Farmer> listAllFarmers() {
	
	return farmDAO.findAll();
}

@Override
public Farmer findFarmerID(int farmerID) {
	
	return farmDAO.findById(farmerID).get();
}


}
						 