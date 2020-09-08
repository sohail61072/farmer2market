package com.mastek.farmertomarket.apis;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.mastek.farmertomarket.entities.order;

@Path("/farmertomarket/")
public interface orderAPI {

	@GET
	@Path("/order/list")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML}) // formats which the method supports
	public Iterable<order> listAllOrders();
	
	@GET //http method
	@Path("/orders/find/{orderID}") //url with parameter format
	@Produces({MediaType.APPLICATION_JSON})
	public order findOrderID(@PathParam("orderID") int orderID);

	@POST // http method Post used to send data in requests
	@Path("/order/register")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.APPLICATION_JSON)
	public order registerNewOrder(@BeanParam order newOrder);
}


