package com.vtxlab.g2307.model.poly;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Customer extends Human implements Orderable {
  static int counter = 0;

  public Customer(String name) {
    super(name);
  }

  @Override
  public void order() {
    counter++; // insitance method can control static varivable
  }

  public void humanOrder() {
    super.order();
  }

  public void testtest() {

  }

}
