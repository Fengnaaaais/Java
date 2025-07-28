public class Main {
  public static void main(String[] args) {
    Bike bike = new Bike();
    Boat boat = new Boat();
    Car car = new Car();

    Vehicle[] vehicles = {bike, boat, car};

    for (Vehicle vehicle : vehicles) {
      vehicle.go();
    }
  }
}
