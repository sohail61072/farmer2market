package com.mastek.farmertomarket.apis;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.mastek.farmertomarket.services.FarmerToMarketService;



@Component // declare it as spring component
public class APIConfig  extends ResourceConfig{

	
		// configure the service classes using ResourceConfigg
		
		public APIConfig() {
			//register each service class to enable services as API
		
		register(FarmerToMarketService.class);
		register(CORSFilter.class);
		//enable the CORS filter for UI applications to access the service
		}
	}


