package com.gazorpazorp.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.gazorpazorp.model.Sample;

@FeignClient(name="account-service") //Name can be custom name defined in bootstrap.yml, or the name of a service registered with eureka
public interface AccountClient {
	
	@GetMapping(value="/me", consumes = "application/json")
	Sample getCustomer();
}

