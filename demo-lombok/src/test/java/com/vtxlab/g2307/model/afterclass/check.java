package com.vtxlab.g2307.model.afterclass;

public class check {
  public static void main(String[] args) {
    Admin p1 = new Admin();
    p1.checkEmployee();
    p1.onDuty();
    //
    Employee p2 = new Admin();
    p2.checkEmployee();
    p2.onDuty();
    //
    Employee p3 = new Employee();
    p3.checkEmployee();
    p3.onDuty();
    //
    // interface Orderable
    Orderable p4 = new Admin();
    p4.onDuty();
    Orderable p5 = new Employee();

  }
}
