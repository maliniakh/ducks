package yoti.impl;

//import org.springframework.stereotype.Service;
import org.springframework.stereotype.Service;
import yoti.api.Geometry;
import yoti.api.response.AreaResponse;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.math.BigDecimal;

//@Service
//@Path("/geometry")
public class GeometryImpl implements Geometry {

//    @GET
//    @Path("/triangle-area/")
//    @Consumes("application/json")
    public AreaResponse getTriangleArea(BigDecimal a, BigDecimal b, Long reqId) {
        // assuming 0 are acceptable (resulting in 0 area)
        if(a.doubleValue() < 0 || b.doubleValue() < 0) {
            throw new IllegalArgumentException("values must non-negative");
        }

        // todo: max length of 8

        a = a.setScale(2, BigDecimal.ROUND_DOWN);
        b = b.setScale(2, BigDecimal.ROUND_DOWN);

        BigDecimal area = BigDecimal.valueOf(Math.sqrt(a.doubleValue() * a.doubleValue() + b.doubleValue() * b.doubleValue()));


        area = area.setScale(2, BigDecimal.ROUND_DOWN);
        return new AreaResponse(area, reqId);
    }

    @Override
    public String chuj() {
        return "chuj";
    }
}
