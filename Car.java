public class Car {
  String make;
  String model;
  int year;
  String color;

  Car(String make, String model, int year, String color) {
    this.make = make;
    this.model = model;
    this.year = year;
    this.color = color;
  }

  // void showInfo() {
  //   System.out.printf(
  //       "A %s %s %s is created at %d\n", this.color, this.make, this.model, this.year);
  // }

  @Override
  public String toString() {
    return String.format("%s %d %s %s", this.color, this.year, this.make, this.model);
  }
}
