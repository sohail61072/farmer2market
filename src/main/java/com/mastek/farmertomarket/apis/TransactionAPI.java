package com.mastek.farmertomarket.apis;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.mastek.farmertomarket.entities.Transaction;

@Path("/farmertomarket/")
public interface TransactionAPI {

	@GET
	@Path("/transaction/list")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML}) // formats which the method supports
	public Iterable<Transaction> listAllTransactions();
	
	@GET //http method
	@Path("/transaction/find/{transactionID}") //url with parameter format
	@Produces({MediaType.APPLICATION_JSON})
	public Transaction findTransactionID(@PathParam("transactionID") int transactionID);

	@POST // http method Post used to send data in requests
	@Path("/transaction/register")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.APPLICATION_JSON)
	public Transaction registerNewTransaction(@BeanParam Transaction newTransaction);
}


