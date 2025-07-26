package mymath;

public class MathUtils {

    public static double average(int... numbers) {
        double sum = 0;

        if (numbers.length == 0) {
            return 0;
        }

        for (int number : numbers) {
            sum += number;
        }

        return sum / numbers.length;
    }

    public static double getHypotenuse(double a, double b) {
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }

    public static class Circle {
        double radius;

        public Circle(double radius)
        {
            this.radius = radius;
        }

        public double getCircumference() {
            return 2 * Math.PI * this.radius;
        }

        public double getArea() {
            return Math.PI * Math.pow(this.radius, 2);
        }

        public double getVolume() {
            return (4.0 / 3.0) * Math.PI * Math.pow(this.radius, 3);
        }
    }
}
