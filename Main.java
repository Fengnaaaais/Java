import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    double weight;
    double newWeight;
    int choise;

    System.out.println("Weight conversion program!");
    System.out.println("1: Conver lbs to kgs");
    System.out.println("2: Conver kgs to lgs");

    System.out.print("Choose an option: ");
    choise = in.nextInt();

    switch (choise) {

      case 1:
        System.out.print("Enter the weight in lbs: ");
        weight = in.nextDouble();

        newWeight = weight * 0.453592;

        System.out.printf("The new weight in kgs is: %.2f", newWeight);
        break;

      case 2:
        System.out.print("Enter the weight in kgs: ");
        weight = in.nextDouble();
        
        newWeight = weight * 2.20462;

        System.out.printf("The new weight in lbs is: %.2f", newWeight);
        break;

      default:
        System.out.println("Enter correct value!");
        break;
    }

    in.close();
  }
}
