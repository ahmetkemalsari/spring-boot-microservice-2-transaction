package com.sha.springbootmicroservice2transaction.Controllers;

import com.sha.springbootmicroservice2transaction.Models.Transaction;
import com.sha.springbootmicroservice2transaction.Services.ITransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/1.0/transaction")
public class TransactionController {

    @Autowired
    private ITransactionService transactionService;

    @PostMapping
    public ResponseEntity<?> saveTransaction(@RequestBody Transaction transaction){
        return ResponseEntity.ok(transactionService.saveTransaction(transaction));
    }
    @GetMapping("/{userId}")
    public ResponseEntity<?> getAllTransactionOfUser(@PathVariable Long userId){
        return ResponseEntity.ok(transactionService.findAllTransactionsOfUser(userId));
    }
    @DeleteMapping("/{transactionId}")
    public ResponseEntity<?> deleteTransaction(@PathVariable Long transactionId){
        transactionService.deleteTransaction(transactionId);
        return ResponseEntity.ok().body("deleted");
    }


}
