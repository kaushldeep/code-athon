package com.kaush.paypal.controller;

import com.kaush.paypal.model.TransactionDetails;
import com.kaush.paypal.service.PaypalServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("transaction")
public class PaypalServiceController {

    @Autowired
    private PaypalServiceImpl paypalServiceImpl;

    @RequestMapping(value = "date/{date}", method = RequestMethod.GET, produces = "application/json")
    public TransactionDetails getTransactionsByDate(@PathVariable String date) {
     return paypalServiceImpl.getTransactionsByDate(date);
    }

    @RequestMapping(value="userId/{userId}", method = RequestMethod.GET, produces = "application/json")
    public TransactionDetails getTransactionsByUserId(@PathVariable String userId) {
        return paypalServiceImpl.getTransactionsByUser(userId);
    }

    @RequestMapping(value="userId/{userId}/transactionType/{transactionType}",
            method = RequestMethod.GET, produces = "application/json")
    public TransactionDetails getTransactionsByUserAndTransactionType(@PathVariable String userId,
                                                                      @PathVariable String transactionType) {
        return paypalServiceImpl.getTransactionsByUserAndTransactionType(userId, transactionType);
    }
}
