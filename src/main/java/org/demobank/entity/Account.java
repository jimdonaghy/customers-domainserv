package org.demobank.entity;

import java.time.LocalDate;
import java.util.Currency;
import java.util.List;

import org.bson.codecs.pojo.annotations.BsonProperty;

import io.quarkus.mongodb.panache.common.MongoEntity;
import io.quarkus.mongodb.panache.PanacheMongoEntity;

@MongoEntity(collection = "Accounts")
public class Account extends PanacheMongoEntity {
    
    @BsonProperty("account_number")
    public String accountNumber;
    
    public int balance;
    
    @BsonProperty("contract_id")
    public int contractId;
    
    @BsonProperty("party_id")
    public int partyId;


    public List<Transaction> transactions;
    

    // entity methods
    public static Account findByAccountNumber(String accountNumber) {
        return find("account_number", accountNumber).firstResult();
    }

    public static List<Account> findOpen() {
        return list("status", "open");
    }

    
}
