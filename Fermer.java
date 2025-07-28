public class Fermer extends Person {
  int numOfCows;

  Fermer(String first_name, String last_name, int cows) {
    super(first_name, last_name);
    this.numOfCows = cows;
  }

  void showInfo() {
    System.out.printf("%s has %d cows", this.getName(), this.numOfCows);
  }
}
