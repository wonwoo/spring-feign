package me.wonwoo.web;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by wonwoolee on 2017. 8. 13..
 */
@RestController
@RequestMapping("/accounts")
public class AccountController {

  private final static List<Account> GENERATOR_ACCOUNT;

  static {
    GENERATOR_ACCOUNT = new ArrayList<>();
    GENERATOR_ACCOUNT.add(new Account("wonwoo", "test@test.com"));
    GENERATOR_ACCOUNT.add(new Account("kevin", "kevin@test.com"));
  }

  private final GeneratorAccount GENERATOR = new GeneratorAccount(GENERATOR_ACCOUNT);


  @GetMapping
  public List<Account> findAccounts() {
    return GENERATOR.toList();
  }

  @GetMapping("/{name}")
  public Account findAccount(@PathVariable String name) {
    return GENERATOR.getName(name).orElse(null);
  }

  @PostMapping
  public Account save(@RequestBody Account account) {
    return GENERATOR.save(account);
  }

  @DeleteMapping("/{name}")
  public void delete(@PathVariable String name) {
    GENERATOR.delete(name);
  }

  @GetMapping("/exception")
  public Account findException() {
    throw new RuntimeException();
  }
}
