public class Main {
  public static void main(String[] args) {

    Book book1 = new Book("Go by example", 150);
    Book book2 = new Book("Django by example", 320);
    Book book3 = new Book("Python by example", 324);

    Book[] books = {book1, book2, book3};

    Library library = new Library("NYC Public Library", 1897, books);
    System.out.println(library.getInfo());

    // Book found = library.detailBook("Go by example");
    // if (found != null) {
    //   System.out.println(found.getInfo());
    // } else {
    //   System.out.println("Книга не найдена.");
    // }

    library.displayInfo();
    String message = "Hello";

    System.out.println(message[1]);
  }
}
