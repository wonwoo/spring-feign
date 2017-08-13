package me.wonwoo.client;

import me.wonwoo.web.Account;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * Created by wonwoolee on 2017. 8. 13..
 */
@FeignClient(name = "accounts-service", url = "localhost:8081", path = "/accounts")
public interface AccountClient {

  @GetMapping
  List<Account> accounts();

  @GetMapping("/{name}")
  Account account(@PathVariable("name") String name);

  @PostMapping
  Account save(Account account);

  @DeleteMapping("/{name}")
  void delete(@PathVariable("name") String name);

  @GetMapping("/exception")
  Account exception();
}
