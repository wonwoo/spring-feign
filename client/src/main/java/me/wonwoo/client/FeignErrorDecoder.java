package me.wonwoo.client;

import feign.Response;
import feign.codec.ErrorDecoder;
import me.wonwoo.exception.HttpClientException;
import me.wonwoo.exception.HttpServerException;

import static feign.FeignException.errorStatus;

/**
 * Created by wonwoolee on 2017. 8. 13..
 */
public class FeignErrorDecoder implements ErrorDecoder {

  @Override
  public Exception decode(String methodKey, Response response) {
    if (response.status() >= 400 && response.status() <= 499) {
      return new HttpClientException(
          response.status(),
          response.reason()
      );
    }
    if (response.status() >= 500 && response.status() <= 599) {
      return new HttpServerException(
          response.status(),
          response.reason()
      );
    }
    return errorStatus(methodKey, response);
  }
}