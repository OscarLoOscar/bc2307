package com.vtxlab.g2307.model.poly;

public class Driver implements Orderable {

  @Override
  public void order() {
    Customer.counter += 3;
  }

}
