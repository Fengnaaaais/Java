import java.util.Scanner;

import mymath.MathUtils;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double a = in.nextDouble();

        System.out.print("Введите второе число: ");
        double b = in.nextDouble();

        System.out.printf("%.2f", MathUtils.getHypotenuse(a, b));

        in.close();
    }
}
