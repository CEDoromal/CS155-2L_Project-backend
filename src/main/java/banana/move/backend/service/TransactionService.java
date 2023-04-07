package banana.move.backend.service;

import banana.move.backend.model.Transaction;
import banana.move.backend.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TransactionService {
    @Autowired
    private TransactionRepository transactionRepository;

    public List<Transaction> getAllTransactions() {
        List<Transaction> transactionRecords = new ArrayList<>();
        transactionRepository.findAll().forEach(transactionRecords::add);
        return transactionRecords;
    }

    public Transaction addTransaction(Transaction transaction)
    {
        return transactionRepository.save(transaction);
    }
    public Transaction updateTransaction(Transaction transaction)
    {
        return transactionRepository.save(transaction);
    }
    public Transaction getTransaction(int id)
    {
        Optional<Transaction> transaction = transactionRepository.findById(id);
        if(transaction.isPresent()) {
            return transaction.get();
        }
        else
            return null;
    }
    public void deleteTransaction(int id)
    {
        Optional<Transaction> transaction = transactionRepository.findById(id);
        if(transaction.isPresent()) {
            transactionRepository.delete(transaction.get());
        }
    }
}
