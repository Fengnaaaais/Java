import java.util.Scanner;
 
public class Program {
 
    public static void main(String[] args) {
 
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = in.nextInt();
 
        if(num > 2 && num < 9){
            System.out.println("Число больше 2 и меньше 9");
        }
        else{
            System.out.println("Неизвестное число");
        }
        in.close();
    }
}
