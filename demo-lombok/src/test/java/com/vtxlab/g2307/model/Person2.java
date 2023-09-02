package com.vtxlab.g2307.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Person2 {
  private String name;
  private List<String> address;

  public Person2(String str) {
    this.name = str;
  }

  @Override
  public String toString() {
    return "Person(name=" + this.name //
        + ")";
  }
}
