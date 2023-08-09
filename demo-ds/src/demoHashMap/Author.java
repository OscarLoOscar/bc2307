package demoHashMap;

import java.util.Objects;
import demohashset.Book;

public class Author {
  String name;
  int age;

  public Author(String name) {
    this.name = name;
  }

  public Author(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public String toString() {
    return this.name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (!(o instanceof Author))
      return false;
    Author author = (Author) o;
    return author.name.equals(this.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.name);
  }

}
