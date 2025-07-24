import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    String email;
    String username;
    String domain;

    System.out.print("Enter your email: ");
    email = in.nextLine();

    if (email.contains("@")) {
      username = email.substring(0, email.indexOf("@"));
      domain = email.substring(email.indexOf("@") + 1);

      System.out.println(email);
      System.out.printf("Your username: %s\n", username);
      System.out.printf("Your domain: %s\n", domain);
    } else {
      System.out.println("Email must contain \"@\"");
    }


    in.close();
  }
}
