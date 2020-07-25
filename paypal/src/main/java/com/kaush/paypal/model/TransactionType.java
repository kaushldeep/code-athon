package com.kaush.paypal.model;

public enum TransactionType {
    INVOICE("Invoice"),
    BILLING("Billing"),
    SUBSCRIPTION("Subscription");

    private String transactionType;
    TransactionType(String transactionType) {
        this.transactionType = transactionType;
    }
}
