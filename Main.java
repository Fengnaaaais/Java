public class Main {
  public static void main(String[] args) {
    String Name = "     Pshon non   ";

    // Methods that return's a string
    Name = Name.trim(); // Delete spaces before, after
    Name = Name.replace("n", "a"); // Replace all "n" to "a"
    String NAME = Name.toUpperCase();
    String name = Name.toLowerCase();

    // Get info
    int length = Name.length(); // String's length
    char letter = Name.charAt(0); // Get char from index
    int index = Name.indexOf("P"); // Get first index form char
    int lastIndex = Name.lastIndexOf("o"); // Get last index from char

    System.out.println(letter); // P
    System.out.println(length); // 9
    System.out.println(index); // 0
    System.out.println(lastIndex); // 7
    System.out.println(NAME); // PSHON NON
    System.out.println(name); // pshon non

    /*
    Is empty
    if (Name.isEmpty()) {
      System.out.println("Your name is empty"); // 
    } else {
      System.out.printf("Hello %s", Name);
    }

    Is name contains space
    if (Name.contains(" ")) {
      System.out.println("Your name contains a space");
    } else {
      System.out.println("Your name doesn't contain any space ")
    }

    Is equal without ignore case
    if (Name.equals("Fengnaaaais")) {
      System.out.prinln("This name is busy");
    } else {
      System.out.println("You can use this name!");
    }

    Is equal with ignore case
    if (Name.equalsIgnoreCase("Fengnaaaais")) {
      System.out.prinln("This name is busy");
    } else {
      System.out.println("You can use this name!");
    }
    */

  }
}
