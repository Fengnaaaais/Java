import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int num1 = in.nextInt();


        System.out.print("Введите второе число: ");
        int num2 = in.nextInt();

        System.out.print("Введите операцию\n  1. Сложение\n  2. Вычетание\n  3.Умножение\n: ");
        int operation = in.nextInt();

        sum(num1, num2, operation);

        in.close();
    }

    static void sum(int a, int b, int operation) {
        int res = 0;
        String operation_name = "";
        switch (operation) {
            case 1:
                res = a + b;
                operation_name = "сложение";
                break;
            case 2:
                res = a - b;
                operation_name = "вычетание";
                break;
            case 3:
                res = a * b;
                operation_name = "умножение";
                break;
            default:
                System.out.println("Операция неопределена");
        }
        System.out.printf("Результат %s %d, %d = %d\n", operation_name, a, b, res);
    }
}
