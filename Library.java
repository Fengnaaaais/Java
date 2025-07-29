public class Library {
  private String name;
  private int year;
  private Book[] books;

  Library(String name, int year, Book[] books) {
    this.name = name;
    this.year = year;
    this.books = books;
  }

  String getInfo() {
    return String.format(
        "Name: %s\nYear: %d\tNum of books: %d", this.name, this.year, this.books.length);
  }

  Book detailBook(String name) {
    for (Book book : this.books) {
      if (book.getName().equals(name)) {
        return book;
      }
    }
    return null;
  }

  void displayInfo() {
    System.out.println("Available books:");
    for (Book book : this.books) {
      System.out.println(book.getInfo());
    }
  }
}
