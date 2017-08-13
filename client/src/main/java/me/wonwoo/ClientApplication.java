package me.wonwoo;

import feign.codec.ErrorDecoder;
import me.wonwoo.client.FeignErrorDecoder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

/**
 * Created by wonwoolee on 2017. 8. 13..
 */
@EnableFeignClients
@SpringBootApplication
public class ClientApplication {

  public static void main(String[] args) {
    SpringApplication.run(ClientApplication.class, args);
  }

  @Bean
  public ErrorDecoder cbsErrorDecoder() {
    return new FeignErrorDecoder();
  }

}
