import java.util.Scanner;
 
public class Program {
   
    public static void main(String[] args) {
           
        Scanner in = new Scanner(System.in); 
        System.out.print("Введите первое число: ");
        int num1 = in.nextInt();
         
        System.out.print("Введите второе число: ");
        int num2 = in.nextInt();
 
        if(num1 > num2){
            System.out.println("Первое число больше второго");
        }
        else if (num1 < num2){
            System.out.println("Первое число меньше второго");
        }
        else{
            System.out.println("Оба числа равны");
        }
        in.close();
    }
}
