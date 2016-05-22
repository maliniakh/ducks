package yoti.api;

import yoti.api.response.AreaResponse;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import java.math.BigDecimal;

@Path("/geometry")
public interface Geometry {

    @GET
    @Path("/triangle-area/{a}/{b}")
    @Produces("application/json")
    AreaResponse getTriangleArea(@PathParam("a") BigDecimal a, @PathParam("b") BigDecimal b, @QueryParam("id") Long reqId);

    @GET
    @Path("/chuj")
    String chuj();
}
