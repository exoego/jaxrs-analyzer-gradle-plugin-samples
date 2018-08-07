package com.github.grimmjo.jaxrs_analyzer.gradle.sample;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

/**
 * @author jgrimm
 */
@Path("/coffee")
public class CoffeeResource {

    @GET
    public String getCoffee() {
        return "That's a coffee";
    }

    @POST
    public String createCoffee(String coffee) {
        return "That's a " + coffee;
    }

}
