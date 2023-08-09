package demohashset;

import java.util.Objects;
import demoHashMap.Author;

public class Book {
  String name;

  public Book(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return this.name;
  }
  // @Override
  // public boolean equals(Object o) {
  // if (this == o)
  // return true;
  // if (!(o instanceof Book))
  // return false;
  // Book books = (Book) o;
  // return this.author == books.author;
  // }

  // @Override
  // public int hashCode() {
  // return Objects.hash(this.author);
  // }

  // @Override
  // public int hashCode() {
  // int result = 17;
  // result = 31 + result + author;
  // return result;
  // }
}
