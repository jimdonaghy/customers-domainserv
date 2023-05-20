package org.demobank.entity;

import java.time.LocalDate;

import org.bson.codecs.pojo.annotations.BsonProperty;


public class Transaction {
    
    @BsonProperty("date")
    public LocalDate transactionDate;

    @BsonProperty("description")
    public String description;

    @BsonProperty("amount")
    public int amount;

}
