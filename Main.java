import java.util.Scanner;

import mymath.MathUtils;

public class Main {
    public static void main(String[] args) {
        String name = "asdf";
        char firstLetter = 'a';
        int age = 30;
        double height = 1.73;
        boolean isWorking = true;

        System.out.printf("Hello %s\n", name);
        System.out.printf("Your name starts with a \"%c\"\n", firstLetter);

        System.out.printf("You are %d years old\n", age);
        System.out.printf("You are %04d years old\n", age); 
        System.out.printf("You are %4d years old\n", age); // right justefied padding
        System.out.printf("You are %-4d years old\n", age); // left justefied padding

        System.out.printf("You height is %f m\n", height);
        System.out.printf("You height is %.2f m\n", height);
        Sysetm.out.printf("You height is %+.2f m\n", height); // output a plus
        Sysetm.out.printf("You height is %,.2f m\n", height); // comma grouping separatorz
        Sysetm.out.printf("You height is %(.2f m\n", height); // if negative enclose in ()
        Sysetm.out.printf("You height is % .2f m\n", height); // if negative - add "-" else before else space
        
        System.out.printf("Status:\tYou are working %b\n", isWorking);

        System.out.printf("%s is %d years old", name, age);
    }
}
