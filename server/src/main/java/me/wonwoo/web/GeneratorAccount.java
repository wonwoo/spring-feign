package me.wonwoo.web;

import java.util.List;
import java.util.Optional;

/**
 * Created by wonwoolee on 2017. 8. 13..
 */
public class GeneratorAccount {

  private final Generator<Account> generator;

  public GeneratorAccount(List<Account> accounts) {
    generator = new Generator<>(accounts);
  }

  public Optional<Account> getName(String name) {
    return generator.toList().stream().filter(account -> account.getName().equals(name)).findFirst();
  }

  public Account save(Account account) {
    generator.put(account);
    return account;
  }

  public void delete(String name) {
    getName(name).ifPresent(generator::delete);
  }

  public List<Account> toList() {
    return generator.toList();
  }

}
