public class Main {
  public static void main(String[] args) {
    Car car = new Car("Toyota", "Black", 20000);

    car.setColor("Red");
    car.setPrice(150000);

    System.out.println(car.getInfo());
  }
}
