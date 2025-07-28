public class Car {
  private final String model;
  private String color;
  private int price;

  Car(String model, String color, int price) {
    this.model = model;
    this.color = color;
    this.price = price;
  }

  String getInfo() {
    return String.format("Model: %s\tColor: %s\tPrice: %d", this.model, this.color, this.price);
  }

  void setColor(String color) {
    this.color = color;
  }

  void setPrice(int price) {
    this.price = price;
  }
}
