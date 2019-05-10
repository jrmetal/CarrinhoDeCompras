
package com;

import com.remote.ProductFacadeRemote;
import javax.ejb.EJB;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.core.MediaType;

@Path("Test")
@RequestScoped
public class TestResource {

    @Context
    private UriInfo context;
    
    @EJB
    ProductFacadeRemote productFacadeRemote;


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
       return productFacadeRemote.teste().toString();
    }

}
