public class Main {
  public static void main(String[] args) {
    Friend friend1 = new Friend("Spongebob");
    Friend friend2 = new Friend("Patrick");
    Friend friend3 = new Friend("Squidward");
    Friend friend4 = new Friend("Sandy");

    System.out.println(friend1.name);
    Friend.showFriends();
  }
}

