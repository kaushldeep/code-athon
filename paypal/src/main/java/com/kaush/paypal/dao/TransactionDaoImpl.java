package com.kaush.paypal.dao;

import com.kaush.paypal.model.Transaction;
import com.kaush.paypal.model.Transactions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TransactionDaoImpl{

    @Autowired
    TransactionService transactionRepository;

    public List<Transaction> getTransactionByUserId(String userId) {
        List<Transaction> transactionList = new ArrayList<Transaction>();

        final List<Transactions> transactions = new ArrayList<>();
        transactionRepository.findByUserId(userId).forEach(
                transactionEntity -> transactions.add(transactionEntity));

        for (Transactions entity:
        transactions) {
           if(entity.getUserId().equalsIgnoreCase(userId)){
               Transaction transaction = transferData(entity);
               transactionList.add(transaction);
           }
        }
        return transactionList;
    }

    public List<Transaction> getTransactionByDate(String date) {
        List<Transaction> transactionList = new ArrayList<Transaction>();

        final List<Transactions> transactions = new ArrayList<>();
        transactionRepository.findByDate(date).forEach(
                transactionEntity -> transactions.add(transactionEntity));

        for (Transactions entity:
                transactions) {
            if(entity.getTransactionDate().equalsIgnoreCase(date)){
                Transaction transaction = transferData(entity);
                transactionList.add(transaction);
            }
        }
        return transactionList;
    }

    public List<Transaction> getTransactionByUserIdAndType(String userId,String type) {
        List<Transaction> transactionList = new ArrayList<Transaction>();

        final List<Transactions> transactions = new ArrayList<>();
        transactionRepository.findByUserId(userId).forEach(
                transactionEntity -> transactions.add(transactionEntity));

        transactionRepository.findByTransactionByType(type).forEach(
                transactionEntity -> transactions.add(transactionEntity));

        for (Transactions entity:
                transactions) {
            if(entity.getUserId().equalsIgnoreCase(userId)
            && entity.getTransactionType().equalsIgnoreCase(type)){
                Transaction transaction = transferData(entity);
                transactionList.add(transaction);
            }
        }
        return transactionList;
    }


    private Transaction transferData(Transactions dto) {
        Transaction trn = new Transaction();
        trn.setUserId(dto.getUserId());
        trn.setAmount(dto.getAmount());
        trn.setTransactionType(dto.getTransactionType());
        trn.setTransactionDate(dto.getTransactionDate());

        return trn;
    }
}
