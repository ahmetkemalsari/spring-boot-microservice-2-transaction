package com.sha.springbootmicroservice2transaction.Services;

import com.sha.springbootmicroservice2transaction.Models.Transaction;
import com.sha.springbootmicroservice2transaction.repositories.ITransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class TransactionService implements ITransactionService{
    @Autowired
    private ITransactionRepository repository;

    @Override
    public Transaction saveTransaction(Transaction transaction){
        transaction.setTransactionTime(LocalDateTime.now());
        return repository.save(transaction);
    }
    @Override
    public void deleteTransaction(long id){
        repository.deleteById(id);
    }
    @Override
    public List<Transaction> findAllTransactionsOfUser(long userId){
        return repository.findAllByUserId(userId);
    }

}
