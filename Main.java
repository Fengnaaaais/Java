import java.util.Scanner;

import mymath.MathUtils;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double radius;
        double circumference;
        double area;
        double volume;

        System.out.print("Enter the radius: ");
        radius = in.nextDouble();

        MathUtils.Circle c = new MathUtils.Circle(radius);

        circumference = c.getCircumference();
        area = c.getArea();
        volume = c.getVolume();

        System.out.printf("The circumference is: %.2f cm\n", circumference);
        System.out.printf("The area is: %.2f cm³\n", area);


        in.close();
    }
}
