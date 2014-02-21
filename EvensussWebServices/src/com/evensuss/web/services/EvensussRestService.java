package com.evensuss.web.services;

import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;


public class EvensussRestService extends ServerResource {
	
	@Get
	public String getHello() {
		return "Hello World";
	}

}
