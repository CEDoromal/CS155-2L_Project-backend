package banana.move.backend.service;

import banana.move.backend.model.Account;
import banana.move.backend.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AccountService {
    @Autowired
    private AccountRepository accountRepository;

    public List<Account> getAllAccounts() {
        List<Account> accountRecords = new ArrayList<>();
        accountRepository.findAll().forEach(accountRecords::add);
        return accountRecords;
    }

    public Account addAccount(Account account)
    {
        return accountRepository.save(account);
    }
    public Account updateAccount(Account account)
    {
        return accountRepository.save(account);
    }
    public Account login(String username, String password)
    {
        Optional<Account> account = accountRepository.findByUsernameAndPassword(username, password);
        if(account.isPresent()) {
            return account.get();
        }
        else
            return null;
    }
    public void deleteAccount(int id)
    {
        Optional<Account> account = accountRepository.findById(id);
        if(account.isPresent()) {
            accountRepository.delete(account.get());
        }
    }
}
