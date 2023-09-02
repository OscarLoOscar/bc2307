package com.vtxlab.g2307.model.afterclass;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// @AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Admin extends Employee {

  public Admin(String name) {
    super(name);
  }

  // implement from Employee class
  @Override
  public void onDuty() {
    System.out.println("from Admin");
  }

  public void checkEmployee() {

  }
}