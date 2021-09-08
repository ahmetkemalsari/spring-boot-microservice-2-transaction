package com.sha.springbootmicroservice2transaction.Services;

import com.sha.springbootmicroservice2transaction.Models.Transaction;

import java.util.List;

public interface ITransactionService {
    Transaction saveTransaction(Transaction transaction);

    void deleteTransaction(long id);

    List<Transaction> findAllTransactionsOfUser(long userId);
}
