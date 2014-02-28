package com.evensuss.web.services;

import org.restlet.resource.Get;

import com.evensuss.web.security.OAuthProtectedResource;

public class EvensussLoginRest extends OAuthProtectedResource {

	@Get
	public String login() {
		return "Login Rest Services";
	}
	
	public String getSecretKey() {
		
		return null;
	}
	
}
