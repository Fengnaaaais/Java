public class Engine {
  private String type;

  Engine(String type) {
    this.type = type;
  }

  String getType() {
    return this.type;
  }

  void start() {
    System.out.printf("You start the %s engine\n", this.type);
  }
}
