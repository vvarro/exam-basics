import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class Copy {
  public static void main(String[] args) {
    // This should be the basic replica of the 'cp' command
    // If ran from the command line without arguments
    // It should print out the usage:
    // copy [source] [destination]
    // When just one argument is provided print out
    // No destination provided
    // When both arguments provided and the source is a file
    // Read all contents from it and write it to the destination
  }

  public void printOutUsage() {
    System.out.println("copy [source] [destination]");
  }

  public void createTextFile() {
    PrintWriter writer = null;
    try {
      writer = new PrintWriter("theSourceFile.txt", "UTF-8");
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (UnsupportedEncodingException e) {
      e.printStackTrace();
    }
    writer.println("The first line");
    writer.println("The second line");
    writer.close();
  }
}
