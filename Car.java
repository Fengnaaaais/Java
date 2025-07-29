public class Car {
  private String model;
  private int year;
  private Engine engine;

  Car(String model, int year, String engineType) {
    this.model = model;
    this.year = year;
    this.engine = new Engine(engineType);
  }

  String getInfo() {
    return String.format(
        "Model: %s\tYear: %d\tEngine type: %s\n", this.model, this.year, this.engine.getType());
  }

  void start() {
    this.engine.start();
    System.out.printf("You drive the %s\n", this.model);
  }
}
