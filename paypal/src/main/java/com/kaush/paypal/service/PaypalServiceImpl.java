package com.kaush.paypal.service;

import com.kaush.paypal.model.Transaction;
import com.kaush.paypal.model.TransactionDetails;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PaypalServiceImpl {

    public TransactionDetails getTransactionsByDate(String Date) {
        TransactionDetails transactionDetails = new TransactionDetails();
        List<Transaction> transList = new ArrayList<Transaction>();

        transactionDetails.setTransactionList(transList);
        return transactionDetails;


    }

    public TransactionDetails getTransactionsByUser(String userId) {
        TransactionDetails transactionDetails = new TransactionDetails();
        List<Transaction> transList = new ArrayList<Transaction>();

        transactionDetails.setTransactionList(transList);
        return transactionDetails;


    }

    public TransactionDetails getTransactionsByUserAndTransactionType(Transaction transaction) {
        TransactionDetails transactionDetails = new TransactionDetails();
        List<Transaction> transList = new ArrayList<Transaction>();

        transactionDetails.setTransactionList(transList);
        return transactionDetails;

    }


}
