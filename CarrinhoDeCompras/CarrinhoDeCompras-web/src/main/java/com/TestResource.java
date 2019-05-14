package com;

import com.carrinhoDeCompras.entities.Product;
import com.google.gson.Gson;
import com.remote.ProductFacadeRemote;
import javax.ejb.EJB;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Path;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.POST;
import javax.ws.rs.core.MediaType;

@Path("Test")
@RequestScoped
public class TestResource {

    @Context
    private UriInfo context;

    @EJB
    ProductFacadeRemote productFacadeRemote;

    @POST 
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson(String prod) {

        String token = "123";

        Product p;
//        p.setDescription("ACHOCOLATADO NESCAU EM PÓ 2.0 LATA NESTLÉ 400G");
//        p.setBarCode("7891000053508");
//        p.setStatus('A');
//        Date now = new Date(System.currentTimeMillis());
//        p.setCreatedTime(now);

        Gson g = new Gson();

        p = g.fromJson(prod, Product.class);

        productFacadeRemote.create(token, p);
        return p.toString();
    }

}
