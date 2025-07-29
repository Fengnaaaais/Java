import java.io.FileWriter;
import java.io.IOException;

public class Main {

  public static void main(String[] args) {
    String filePath = "text.txt";
    String fileContent =
        """
        Pshon negr
        Pshon nerg
        Pshon ergn
        Pshon rgne
        """;

    try (FileWriter writer = new FileWriter(filePath)) {
      writer.write(fileContent);
      System.out.println("File has been succesful writed");
    } catch (IOException e) {
      System.out.println("Could not write file" + e.getMessage());
    }
  }
}
