package com.mastek.farmertomarket.apis;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.mastek.farmertomarket.entities.product;

@Path("/farmertomarket/")
public interface productAPI {

	@GET
	@Path("/product/list")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML}) // formats which the method supports
	public Iterable<product> listAllProducts();
	
	@GET //http method
	@Path("/product/find/{productID}") //url with parameter format
	@Produces({MediaType.APPLICATION_JSON})
	public product findProductID(@PathParam("productID") int productID);

	@POST // http method Post used to send data in requests
	@Path("/product/register")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.APPLICATION_JSON)
	public product registerNewProduct(@BeanParam product newProduct);
}

