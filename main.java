import java.util.Scanner;

public class Program {

  public static void main (String args[]) {

    Scanner in = new Scanner(System.in);

    System.out.print("Введите первое число: ");
    int num1 = in.nextInt();


    System.out.print("Введите второе число: ");
    int num2 = in.nextInt();

    System.out.print("Введите номер операции: 1.Сложение  2.Вычитание  3.Умножение: ");
    int opeartion = in.nextInt();

    int res = 0;

    switch (opeartion) 
    {
        case 1:
            res = num1 + num2;
            break;
        case 2:
            res = num1 - num2;
            break;
        case 3:
            res = num1 * num2;
            break;
        default:
            System.out.println("Операция не определена\n");
            break;
    }
    
    System.out.printf("Результат операций: %d\n", res);

    in.close();
  }
}

