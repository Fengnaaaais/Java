import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите сумму вклада: ");
        float sum = in.nextFloat();

        System.out.print("Введите срок вклада в месяцах: ");
        int month = in.nextInt();

        for (int i = 0; i < month; i++) {
            sum *= 1.07;
        }
        System.out.printf("После %d месяцев сумма вклада составит %f", month, sum);
    }
}
