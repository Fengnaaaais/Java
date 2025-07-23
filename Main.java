import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double principal;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        System.out.print("Enter the principal amount: ");
        principal = in.nextDouble();

        System.out.print("Enter the interest rate (in %): ");
        rate = in.nextDouble() / 100;

        System.out.print("Enter the # of times compounded per year: ");
        timesCompounded = in.nextInt();

        System.out.print("Enter the # of years: ");
        years = in.nextInt();

        amount = principal * Math.pow(1 + rate / timesCompounded, timesCompounded * years);

        System.out.printf("The amount after %d years is: $%.2f \n", years, amount);

        in.close();
    }
}
