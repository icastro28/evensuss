package com.evensuss.web.application;

import org.restlet.Application;
import org.restlet.Restlet;
import org.restlet.routing.Router;

import com.evensuss.web.services.EvensussLoginRest;
import com.evensuss.web.services.EvensussRestService;

public class RestApplication extends Application {

	/**
     * Creates a root Restlet that will receive all incoming calls.
     */
    @Override
    public Restlet createInboundRoot() {
        // Create a router Restlet that routes each call to a
        // new instance of HelloWorldResource.
        Router router = new Router(getContext());

        // Defines all the routes
        router.attachDefault(EvensussRestService.class);
        router.attach("/test", EvensussRestService.class);
        router.attach("/login", EvensussLoginRest.class);

        return router;
    }
}
