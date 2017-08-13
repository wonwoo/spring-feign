package me.wonwoo.exception;

/**
 * Created by wonwoolee on 2017. 8. 13..
 */
public class HttpClientException extends RuntimeException {

  private final int status;
  private final String reason;

  public HttpClientException(int status, String reason) {
    this.status = status;
    this.reason = reason;
  }

  public int getStatus() {
    return status;
  }

  public String getReason() {
    return reason;
  }
}
