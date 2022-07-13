package pt.test.cmg.rest;

import java.util.logging.Logger;
import jakarta.enterprise.context.RequestScoped;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/test")
@RequestScoped
public class TestResource {

    private static final Logger LOGGER = Logger.getLogger(TestResource.class.getName());

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response testEndpoint() {
        return Response.ok().build();
    }

}
