package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Staff {
  String name;
  Department department;
  int performance;

  public Staff(String name, Department department, int performance) {
    this.name = name;
    this.department = department;
    this.performance = performance;
  }

  public String getName() {
    return this.name;
  }

  public int getPerformance() {
    return this.performance;
  }

  @Override
  public String toString() {
    return "name : " + this.name + " " + //
        this.department;
  }

  public static void main(String[] args) {
    List<Staff> staffs = Arrays.asList(new Staff("Mary", new Department("HR"), 60), //
        new Staff("Peter", new Department("IT"), 50), //
        new Staff("Eric", new Department("IT"), 70));
    // Map<Department> , List<Staff>
    Map<Department, List<Staff>> depts = staffs.stream()//
        .collect(Collectors.groupingBy(staff -> staff.department));
    //
    depts.forEach((dept, staffList) -> System.out.println(dept + " " + staffList));

    for (Staff staff : depts.get(new Department("IT"))) {// equals && hashCode
      System.out.println(staff);
    }
    //
    Map<Boolean, List<Staff>> grandMap = staffs.stream()//
        .collect(Collectors.partitioningBy(staff -> staff.performance >= 60));

        grandMap.entrySet().stream()//list,set -> stream()
        .forEach(e->System.out.println(e));
  }
}
