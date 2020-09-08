package com.mastek.farmertomarket.apis;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.mastek.farmertomarket.entities.customer;

@Path("/farmertomarket/")
public interface customerAPI {




		@GET
		@Path("/customer/list")
		@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML}) // formats which the method supports
		public Iterable<customer> listAllCustomers();
		
		@GET //http method
		@Path("/customer/find/{customerID}") //url with parameter format
		@Produces({MediaType.APPLICATION_JSON})
		public customer findCustomerID(@PathParam("customerID") int customerID);

		@POST // http method Post used to send data in requests
		@Path("/customer/register")
		@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
		@Produces(MediaType.APPLICATION_JSON)
		public customer registerNewCustomer(@BeanParam customer newCustomer);
}
