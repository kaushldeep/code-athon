package com.kaush.paypal.dao;

import com.kaush.paypal.model.Transaction;
import com.kaush.paypal.model.Transactions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {

    @Autowired
    private JdbcTemplate jtm;

    public List<Transactions> findByUserId(String userId) {
        String sql = "SELECT * FROM TRANSACTIONS WHERE userId = '"+ userId+"'";
        return jtm.query(sql, new BeanPropertyRowMapper<>(Transactions.class));
    }

    public List<Transactions> findByDate(String transactionDate) {
        String sql = "SELECT * FROM TRANSACTIONS WHERE transactionDate = '"+ transactionDate+"'";
        return jtm.query(sql, new BeanPropertyRowMapper<>(Transactions.class));
    }

    public List<Transactions> findByTransactionByUserIdAndType(String userId, String type) {
        String sql = "SELECT * FROM TRANSACTIONS WHERE userId = '"+userId + "' AND transactionType = '"+type+"'";
        return jtm.query(sql, new BeanPropertyRowMapper<>(Transactions.class));
    }

    public List<Transactions> findByTransactionByType(String type) {
        String sql = "SELECT * FROM TRANSACTIONS where transactionType = '"+ type+"'";
        return jtm.query(sql, new BeanPropertyRowMapper<>(Transactions.class));
    }
}
