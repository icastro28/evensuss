package com.evensuss.web.services;

import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

public class EvensussLoginRest extends ServerResource {

	@Get
	public String login() {
		return "Login Rest Services";
	}
}
