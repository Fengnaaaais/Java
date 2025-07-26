public class Main {
    public static void main(String[] args) {

        String[][] groceries = {
            {"apple", "banane", "orange"},
            {"potato", "onion", "carrot"},
            {"chicken", "pork", "beef"}
        };

        groceries[2][1] = "meat"; // replace pork -> meat [row index][element index]
        
        for (String[] foods : groceries) {
            for (String food : foods) {
                System.out.print(food + " ");
            }
            System.out.println();
        }

    }
}


