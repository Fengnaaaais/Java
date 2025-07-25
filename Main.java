import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter the # of dice to roll: ");
        int numOfDice = in.nextInt();
        int total = 0;

        if (numOfDice > 0) {
            for (int i = 0; i < numOfDice; i++) {
                int roll = random.nextInt(6) + 1;  // [0..5] + 1 = [1..6]
                printDie(roll);
                System.out.printf("You rolled: %d\n", roll);
                total += roll;
            }
            System.out.printf("Total: %d\n", total);
        } else {
            System.out.println("# of dice must be greater than 0");
        }

        in.close();
    }

    static void printDie(int roll) {
        String[] dices = {
            """
                 -------
                |       |
                |   ●   |
                |       |
                 -------
            """,
            """
                 -------
                | ●     |
                |       |
                |     ● |
                 -------
            """,
            """
                 -------
                | ●     |
                |   ●   |
                |     ● |
                 -------
            """,
            """
                 -------
                | ●   ● |
                |       |
                | ●   ● |
                 -------
            """,
            """
                 -------
                | ●   ● |
                |   ●   |
                | ●   ● |
                 -------
            """,
            """
                 -------
                | ●   ● |
                | ●   ● |
                | ●   ● |
                 -------
            """
        };

        if (roll >= 1 && roll <= 6) {
            System.out.println(dices[roll - 1]);
        } else {
            System.out.println("Invalid die value: " + roll);
        }
    }
}

