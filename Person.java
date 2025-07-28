public class Person {
  String first_name;
  String last_name;

  Person(String first_name, String last_name) {
    this.first_name = first_name;
    this.last_name = last_name;
  }

  String getName() {
    return this.first_name + " " + this.last_name + "\n";
  }
}
