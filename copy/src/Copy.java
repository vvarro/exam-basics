import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

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

    Copy copy = new Copy();
    copy.createTestFile();
    if (args.length == 0) {
      copy.printOutUsage();
    } else if (args[0].equals("copy") && args.length == 1) {
      System.out.println("No destination provided");
    } else if (args[0].equals("copy") && args.length == 3) {
      copy.addCopyFile(args,copy.readInText(args));
    }
  }

  public static void printOutUsage() {
    System.out.println("copy [source] [destination]");
  }

  public static void createTestFile() {
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

  public static List<String> readInText(String[] args) {
    Path path = Paths.get(args[1]);
    List<String> originalFile;
    try {
      originalFile = Files.readAllLines(path);
    } catch (IOException e) {
      e.printStackTrace();
      originalFile = new ArrayList<>();
    }
    return originalFile;
  }

  public static void addCopyFile(String[] args,List<String> originalFile) {
    PrintWriter copy = null;
    try {
      copy = new PrintWriter(args[2], "UTF-8");
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (UnsupportedEncodingException e) {
      e.printStackTrace();
    }
    for (int i = 0; i < originalFile.size(); i++) {
      copy.println(originalFile.get(i));
    }
    copy.close();
  }
}
