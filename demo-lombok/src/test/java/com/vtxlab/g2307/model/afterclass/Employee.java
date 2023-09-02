package com.vtxlab.g2307.model.afterclass;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Employee implements Orderable {
  private String name;

  @Override
  public void onDuty() {
System.out.println("from Employee");  }
}
