package test;

import java.util.Objects;

public class Department {
  String name;

  public Department(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "dept : " + this.name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o instanceof Department)
      return true;
    Department dept = (Department) o;
    return this.name == dept.name;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.name);
  }
}