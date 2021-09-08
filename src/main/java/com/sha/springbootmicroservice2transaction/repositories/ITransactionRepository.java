package com.sha.springbootmicroservice2transaction.repositories;

import com.sha.springbootmicroservice2transaction.Models.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ITransactionRepository extends JpaRepository<Transaction,Long> {
    List<Transaction> findAllByUserId(Long userId);
}
