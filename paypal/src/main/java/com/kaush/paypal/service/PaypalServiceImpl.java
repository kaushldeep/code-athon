package com.kaush.paypal.service;

import com.kaush.paypal.dao.TransactionDaoImpl;
import com.kaush.paypal.model.TransactionDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PaypalServiceImpl {

    @Autowired
    private TransactionDaoImpl transactionDaoImpl;

    public TransactionDetails getTransactionsByDate(String date) {
        TransactionDetails transactionDetails = new TransactionDetails();
        transactionDetails.setTransactionList(transactionDaoImpl.getTransactionByDate(date));
        return transactionDetails;
    }

    public TransactionDetails getTransactionsByUser(String userId) {
        TransactionDetails transactionDetails = new TransactionDetails();
        transactionDetails.setTransactionList(transactionDaoImpl.getTransactionByUserId(userId));
        return transactionDetails;
    }

    public TransactionDetails getTransactionsByUserAndTransactionType(String userId, String transactionType) {
        TransactionDetails transactionDetails = new TransactionDetails();
        transactionDetails.setTransactionList(
                transactionDaoImpl.getTransactionByUserIdAndType(
                        userId,transactionType));
        return transactionDetails;
    }
}
