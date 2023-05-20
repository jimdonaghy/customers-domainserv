package org.demobank;

import java.util.List;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

import org.bson.types.ObjectId;


@Path("/customers")
@Produces("application/json")
public class CustomerResource {

    @GET
    public List<Customer> list() {
        return Customer.listAll();
    }

    @GET
    @Path("/{id}")
    public Customer get(String id) {
        return Customer.findById(new ObjectId(id));
    }

    
}
