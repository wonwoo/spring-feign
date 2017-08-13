package me.wonwoo.web;

import java.util.List;
import java.util.Optional;

/**
 * Created by wonwoolee on 2017. 8. 13..
 */
public class Generator<T> {

  private final List<T> delegate;

  public Generator(List<T> delegate) {
    this.delegate = delegate;
  }

  public boolean addAll(List<T> addAll) {
    return delegate.addAll(addAll);
  }

  public boolean put(T t) {
    return delegate.add(t);
  }

  public Optional<T> get(T t) {
    return delegate.stream().filter(el -> el.equals(t)).findFirst();
  }

  public boolean delete(T t) {
    return delegate.remove(t);
  }

  public List<T> toList() {
    return delegate;
  }
}
