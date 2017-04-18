import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
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
    if (args.length == 0) {
      System.out.println("Usage: copy [source] [destination]");
    } else if (args.length == 1) {
      System.out.println("No destination provided");
    } else {
      copyFile(args[0], args[1]);
    }
  }

  private static void copyFile(String src, String dest) {
    Path sourcePath = Paths.get(src);
    try {
      List<String> fileContent = Files.readAllLines(sourcePath);
      Path destinationPath = Paths.get(dest);
      Files.write(destinationPath, fileContent);
    } catch (IOException e) {
      System.out.println("Error: could not open source file");
    }
  }
}
