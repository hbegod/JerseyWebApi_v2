package org.example;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.io.Console;

@Path("/test")
public class TestResource {
    @GET
    // The Java method will produce content identified by the MIME Media
    // type "text/plain"
    @Produces("application/json")
    public String getIt() {
        return "{\"phrase\":\"Suck my balls!\"}";
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public void suckMyBalls(String jsondata){
        System.out.println(jsondata);
    }
}
