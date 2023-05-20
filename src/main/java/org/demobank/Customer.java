package org.demobank;

import org.bson.codecs.pojo.annotations.BsonProperty;

import io.quarkus.mongodb.panache.common.MongoEntity;
import io.quarkus.mongodb.panache.PanacheMongoEntity;

@MongoEntity(collection = "Customers")
public class Customer extends PanacheMongoEntity {
    
    @BsonProperty("party_id")
    public int partyId;

    public String name;
    public String address;
    public String phone;
    public String email;


    
}
