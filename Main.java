import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    double temp;
    double newTemp;
    String unit;
    
    System.out.print("Enter the temprerature: ");
    temp = in.nextDouble();

    System.out.print("Convert to Celsius or Farhenheit? (C or F): ");
    unit = in.next().toUpperCase();

    newTemp = (unit.equals("C")) ? (temp - 32) * 5 / 9 : (temp * 9 / 5) + 32;

    System.out.printf("%.1f° %s \n", newTemp, unit);

    in.close();
  }
}
