package com.kaush.paypal.controller;

import com.kaush.paypal.model.Transaction;
import com.kaush.paypal.model.TransactionDetails;
import com.kaush.paypal.service.PaypalServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PaypalServiceController {

    @Autowired
    private PaypalServiceImpl paypalServiceImpl;

    @RequestMapping(method = RequestMethod.GET, value="/transaction/getbyDate")
    @ResponseBody
    public TransactionDetails getTransactionsByDate(@RequestBody String date) {
     return paypalServiceImpl.getTransactionsByDate(date);
    }

    @RequestMapping(method = RequestMethod.GET, value="/transaction/getUserId")
    @ResponseBody
    public TransactionDetails getTransactionsByUserId(@RequestBody String userId) {
        return paypalServiceImpl.getTransactionsByUser(userId);
    }

    @RequestMapping(method = RequestMethod.GET, value="/transaction")
    @ResponseBody
    public TransactionDetails getTransactionsByUserAndTransactionType(@RequestBody Transaction transaction) {
        return paypalServiceImpl.getTransactionsByUserAndTransactionType(transaction);
    }
}
