import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int choice;
    Animal animal;

    System.out.print("Would you like dog or cat (1 - dog 2 - cat): ");
    choice = in.nextInt();

    animal = (choice == 1) ? new Dog() : new Cat();

    animal.speak();

    in.close();
  }
}
