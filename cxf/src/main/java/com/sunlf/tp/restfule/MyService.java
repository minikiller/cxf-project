package com.sunlf.tp.restfule;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("myService")
public interface MyService {

  @GET
  @Path("sayHello/{name}")
  @Produces(MediaType.TEXT_PLAIN)
  String sayHello(@PathParam("name") String name);

    @GET
    @Path("getuser/{id}/")
    @Produces("application/json")
    User getUser(@PathParam("id") String id);
}