package banana.move.backend.controller;

import banana.move.backend.model.Account;
import banana.move.backend.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class AccountController {
    @Autowired
    private AccountService accountService;

    @RequestMapping(value="/accounts")
    public List<Account> getAllAccounts() { return accountService.getAllAccounts(); }

    @RequestMapping(value="/accounts/login", method = RequestMethod.POST)
    public Account getAccount(@PathVariable Map<String, String> payload) { return accountService.login(payload.get("username"), payload.get("password")); }

    @RequestMapping(value="/accounts/add", method = RequestMethod.POST)
    public Account addAccount(@RequestBody Account account) { return accountService.addAccount(account); }

    @RequestMapping(value="/accounts/update", method = RequestMethod.PUT)
    public Account updateAccount(@RequestBody Account account) { return accountService.updateAccount(account); }

    @RequestMapping(value="/accounts/delete/{id}", method = RequestMethod.DELETE)
    public void deleteAccount(@PathVariable int id) { accountService.deleteAccount(id); }
}
