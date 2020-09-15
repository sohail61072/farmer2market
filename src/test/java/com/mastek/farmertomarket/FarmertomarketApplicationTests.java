package com.mastek.farmertomarket;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mastek.farmertomarket.dao.BasketJPADAO;
import com.mastek.farmertomarket.dao.CheckoutJPADAO;
import com.mastek.farmertomarket.dao.CustomerJPADAO;
import com.mastek.farmertomarket.dao.FarmerJPADAO;
import com.mastek.farmertomarket.dao.ItemJPADAO;
import com.mastek.farmertomarket.dao.ProductJPADAO;
import com.mastek.farmertomarket.dao.TransactionJPADAO;
import com.mastek.farmertomarket.entities.Checkout;
import com.mastek.farmertomarket.entities.Customer;
import com.mastek.farmertomarket.entities.FarmType;
import com.mastek.farmertomarket.entities.Farmer;
import com.mastek.farmertomarket.entities.Item;
import com.mastek.farmertomarket.entities.Product;
import com.mastek.farmertomarket.entities.ProductType;
import com.mastek.farmertomarket.entities.Transaction;
import com.mastek.farmertomarket.services.FarmerToMarketService;

//Initialize the JUnit Test with Spring Boot Application Environment
//Spring Boot Test: used to test Spring APplicationContext 
//with all the test cases idenitfied
@SpringBootTest
class FarmertomarketApplicationTests {
	
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
	
	@Autowired
	FarmerToMarketService ftomSvc;
	
	@Test
	void testCheckoutDAOAdd() {
		Checkout check = new Checkout();
		check.setDeliveryDate("21/09/2020");
		check.setTotalCost(22.29);
		
		check = checkDAO.save(check);
	}
	
	@Test
	void testCustomerDAOAdd() {
		Customer cust = new Customer();
		cust.setCustomerForename("Mary");
		cust.setCustomerSurname("Smith");
		cust.setCustomerDOB("18/08/1994");
		cust.setCustomerUsername("m.smith");
		cust.setCustomerAddress("22 Mangolia Crescent, Leeds, LS11PA");
		cust.setCustomerPassword("123456");
		
		cust = custDAO.save(cust);
		
	}
	
	@Test
	void testFarmerDAOAdd() {
		Farmer farm = new Farmer();
		farm.setFarmerForename("Harry");
		farm.setFarmerSurname("Prince");
		farm.setFarmLocation("Ormskirk");
		farm.setFarmName("Berry Knot Farm");
		farm.setFarmType(FarmType.MIXED);
		farm.setFarmerUsername("BerryKnotFarm");
		farm.setFarmerPassword("BKnot123");
		
		farm = farmDAO.save(farm);
	}
	@Test
	void testItemDAOAdd() {
		Item it = new Item();
		it.setItemName("Potatoes");
		it.setItemPrice(0.59);
		it.setItemQuantity(10.00);
		
		it = itemDAO.save(it);
		
	}
	@Test
	void testProductDAOAdd() {
		Product prod = new Product();
		prod.setProductName("Potatoes");
		prod.setProductType(ProductType.VEGETABLES);
		prod.setProductDescription("White potatoes");
		prod.setProductPrice(0.59);
		prod.setProductQuantity(100);
		prod.setProductWeightKG(5.00);
		
		prod = prodDAO.save(prod);
	}
	
	@Test
	void testTransactionDAOAdd() {
		Transaction tran = new Transaction();
		tran.setTransactionDate("22/09/2020");
		tran.setTransactionAmount(10.00);
		
		tran = tranDAO.save(tran);
	}
	
	@Test
	void testAssignCheckoutToCustomer() {
		 ftomSvc.assignCustomerToCheckout(3, 5);
		//assertNotNull(cust.getCurrentCheckout(), "Checkout Not Assigned");
		
		 
		System.out.println("Checkout assigned to customer");
	}
//	@Test
//	void testAssignEmployeeToDepartment() {
//						// empSVC.assingEmployeeToDepartment(empno,deptno)
//			Employee emp = empSvc.assignEmployeeToDepartment(6,12);
//			assertNotNull(emp.getCurrentDepartment(),"Department Not Assigned");
//	}
//	
//	
//	@Test
//	void testAssignEmployeeToProject() {		// empno,projectId
//		Employee emp =  empSvc.assignEmployeeToProject(4,19);
//		assertTrue(emp.getProjectsAssigned().size()>0,"Projects assigned");	
//	}
	}
	
	