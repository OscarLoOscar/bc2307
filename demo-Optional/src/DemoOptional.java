import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DemoOptional {
  public static void main(String[] args) throws Exception {
    List<Book> books = new ArrayList<>();
    books.add(new Book("John"));
    books.add(new Book("Peter"));
    books.add(new Book("Mary"));

    Optional<Book> book1 = books.stream()//
        .filter(b -> b.author.startsWith("P"))//
        .findAny();

    book1.ifPresent(e -> { // 寫唔到else , ifPresent is void
      System.out.println("hello");
    });

    if (book1.isPresent()) {
      System.out.println(book1.get());
    } else {
      System.out.println("no book found");
    }

    Optional<Book> book2 = Optional.of(new Book("Eric"));
    // Optional<Book> book3 = Optional.of(new Book(null));// run-time error
    Optional<Book> book4 = Optional.ofNullable(null);// line 29 = line 31
    Optional<Book> book5 = Optional.ofNullable(new Book("Jenny"));
    Optional<Book> book6 = Optional.empty();
    System.out.println(book6.isPresent());

    Optional<Book> book7 = null;

    // Optional<Book> -> Book
    Book newBook1 = book6.orElse(new Book("Default"));
    Book newBook2 = book7.orElse(null);
    Book newBook4 = book7.orElseGet(() -> new Book("default"));
    Book newBook3 = book6.orElseThrow(() -> new Exception());
    // optional 原因： 比機會用家dounle confirm 入面既野係null
  }

  public static Optional<Book> getBook() {
    // get book logic
    return Optional.empty();
  }
}
