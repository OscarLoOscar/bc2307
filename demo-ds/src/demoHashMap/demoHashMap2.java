package demoHashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import demohashset.Book;

public class demoHashMap2 {
  public static void main(String[] args) {
    HashMap<Integer, Book> books = new HashMap<>();
    // key =address of Byte or Value of Byte ?
    books.put(128, new Book("Book 1"));
    books.put(128, new Book("Book 2"));
    // Integer 自己有hashCode & equals
    // 用hashCode 判斷
    // value 唔重覆，address唔重覆
    System.out.println(books.size());// 1

    HashMap<Author, Book> bookMap = new HashMap<>();
    // author unique key? ->equals() , hashCode()
    Author author1 = new Author("KEN", 30);
    Author author2 = new Author("John", 29);
    System.out.println("1 & 2 diff : " + author1.equals(author2));//false,after override equals & hashCode

    bookMap.put(author1, new Book("Book3"));
    bookMap.put(author2, new Book("Book4"));
    System.out.println("bookMap : " + bookMap.size());// 1

    Map<Author, List<Book>> bookMap2 = new HashMap<>();
    List<Book> bookList1 = new ArrayList<>();
    bookList1.add(new Book("Book1"));
    bookList1.add(new Book("Book2"));
    List<Book> bookList2 = new ArrayList<>();
    bookList2.add(new Book("Book3"));
    bookList2.add(new Book("Book4"));
    bookMap2.put(author1, bookList1);
    bookMap2.put(author2, bookList2);

    // loop bookMap2 , porint out all the book from each Author
    for (Map.Entry<Author, List<Book>> s : bookMap2.entrySet()) {
      System.out.println(s.getKey() + ":" + s.getValue());
    }

    for (Map.Entry<Author, List<Book>> s : bookMap2.entrySet()) {
      for (Book b : s.getValue()) {
        System.out.println(s.getKey().name + " : " + b);
      }
    }

    for (Book book : bookMap2.get(new Author("John , 0"))) {
      System.out.println(book);
    }
  }
}