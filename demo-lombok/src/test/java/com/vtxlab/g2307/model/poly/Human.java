package com.vtxlab.g2307.model.poly;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Human {
  private String name;

  public void order() {
    Customer.counter += 2;
  }
}
