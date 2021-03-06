package com.mastek.farmertomarket.apis;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.mastek.farmertomarket.entities.Item;


@Path("/farmertomarket/")
public interface ItemAPI {
	
	@GET
	@Path("/item/list")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML}) // formats which the method supports
	public Iterable<Item> listAllItems();
	
	@GET //http method
	@Path("/item/find/{itemID}") //url with parameter format
	@Produces({MediaType.APPLICATION_JSON})
	public Item finditemID(@PathParam("itemID") int itemID);

	@POST // http method Post used to send data in requests
	@Path("/item/register")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.APPLICATION_JSON)
	public Item registerNewItem(@BeanParam Item newItem);

//	@GET // http Method: GET to receive data in requests
//	@Path("/item/findByName/{itemName}") // URL path to access this VisaDetails List
//	@Produces({ MediaType.APPLICATION_JSON }) // formats the media type to which the method supports OUTPUT
//	public Item findByName(@PathParam("itemName") String itemName);


}



