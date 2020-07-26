package com.kaush.paypal.dao;

import com.kaush.paypal.model.Transactions;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends CrudRepository<Transactions, Integer> {

}
