package banana.move.backend.controller;

import banana.move.backend.model.Transaction;
import banana.move.backend.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TransactionController {
    @Autowired
    private TransactionService transactionService;

    @RequestMapping(value="/transactions")
    public List<Transaction> getAllTransactions() { return transactionService.getAllTransactions(); }

    @RequestMapping(value="/transactions/{id}")
    public Transaction getTransaction(@PathVariable int id) { return transactionService.getTransaction(id); }

    @RequestMapping(value="/transactions/add", method = RequestMethod.POST)
    public Transaction addTransaction(@RequestBody Transaction transaction) { return transactionService.addTransaction(transaction); }

    @RequestMapping(value="/transactions/update", method = RequestMethod.PUT)
    public Transaction updateTransaction(@RequestBody Transaction transaction) { return transactionService.updateTransaction(transaction); }

    @RequestMapping(value="/transactions/delete/{id}", method = RequestMethod.DELETE)
    public void deleteTransaction(@PathVariable int id) { transactionService.deleteTransaction(id); }
}
