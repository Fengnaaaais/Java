public class Book {
  String title;
  int pages;

  Book(String title, int pages) {
    this.title = title;
    this.pages = pages;
  }

  String getInfo() {
    return String.format("Title: %s\tPages: %d\n", this.title, this.pages);
  }

  String getName() {
    return this.title;
  }
}
