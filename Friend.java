public class Friend {
  static int numOfFriends;
  String name;
  
  Friend(String name) {
    this.name = name;
    numOfFriends++;
  }

  static void showFriends() {
    System.out.printf("You have %d friends", numOfFriends);
  }
}
