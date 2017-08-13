package me.wonwoo.web;

import me.wonwoo.client.AccountClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by wonwoolee on 2017. 8. 13..
 */
@RestController
public class AccountController {

  private final AccountClient accountClient;

  public AccountController(AccountClient accountClient) {
    this.accountClient = accountClient;
  }

  @GetMapping("/")
  public List<Account> findByAccounts() {
    return accountClient.accounts();
  }

  @GetMapping("/{name}")
  public Account findByAccount(@PathVariable String name) {
    return accountClient.account(name);
  }

  @PostMapping("/")
  public Account save(@RequestBody Account account) {
    return accountClient.save(account);
  }

  @DeleteMapping("/{name}")
  public void delete(@PathVariable String name) {
    accountClient.delete(name);
  }

  @GetMapping("/exception")
  public Account exception() {
    return accountClient.exception();
  }

}
