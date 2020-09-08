package com.mastek.farmertomarket.apis;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.mastek.farmertomarket.entities.basket;

@Path("/farmertomarket/")
public interface basketAPI {

	@GET
	@Path("/basket/list")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML}) // formats which the method supports
	public Iterable<basket> listAllBaskets();
	
	@GET //http method
	@Path("/basket/find/{basketID}") //url with parameter format
	@Produces({MediaType.APPLICATION_JSON})
	public basket findBasketID(@PathParam("basketID") int basketID);

	@POST // http method Post used to send data in requests
	@Path("/basket/register")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.APPLICATION_JSON)
	public basket registerNewBasket(@BeanParam basket newBasket);
	
	
	
	
}