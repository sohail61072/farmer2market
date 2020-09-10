package com.mastek.farmertomarket.apis;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.mastek.farmertomarket.entities.Checkout;

@Path("/farmertomarket/")
public interface CheckoutAPI {

	@GET
	@Path("/checkout/list")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML}) // formats which the method supports
	public Iterable<Checkout> listAllCheckouts();
	
	@GET //http method
	@Path("/checkout/find/{checkoutID}") //url with parameter format
	@Produces({MediaType.APPLICATION_JSON})
	public Checkout findCheckoutID(@PathParam("checkoutID") int checkoutID);

	@POST // http method Post used to send data in requests
	@Path("/checkout/register")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.APPLICATION_JSON)
	public Checkout registerNewCheckout(@BeanParam Checkout newCheckout);

}