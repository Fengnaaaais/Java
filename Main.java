public class Main {
  public static void main(String[] args) {
    Car car = new Car("Corvette", 2025, "V8");

    System.out.print(car.getInfo());
    car.start();
  }
}
