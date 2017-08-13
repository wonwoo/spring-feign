package me.wonwoo.web;

import lombok.Data;

/**
 * Created by wonwoolee on 2017. 8. 13..
 */
@Data
public class Account {
  private String name;
  private String email;
  Account() {

  }
  public Account(String name, String email){
    this.name = name;
    this.email = email;
  }

}
