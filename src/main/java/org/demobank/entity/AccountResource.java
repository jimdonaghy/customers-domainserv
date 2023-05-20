package org.demobank.entity;

import java.util.List;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Response;

import org.bson.types.ObjectId;

@Path("/accounts")
@Consumes("application/json")
@Produces("application/json")
public class AccountResource {
    @GET
    public List<Account> list() {
        return Account.listAll();
    }

    @GET
    @Path("/{id}")
    public Account get(String id) {
        return Account.findById(new ObjectId(id));
    }

    /*
    @POST
    public Response create(Person person) {
        person.persist();
        return Response.status(201).build();
    }

    @PUT
    @Path("/{id}")
    public void update(String id, Person person) {
        person.update();
    }

    @DELETE
    @Path("/{id}")
    public void delete(String id) {
        Person person = Person.findById(new ObjectId(id));
        person.delete();
    }

    @GET
    @Path("/search/{name}")
    public Person search(String name) {
        return Person.findByName(name);
    }

    @DELETE
    public void deleteAll(){
        Person.deleteAll();
    }

    */
}

