import java.io.File;
import java.util.Scanner;
import java.io.PrintWriter;

class TextFileWriter {

  String fileName = "file.txt";
  File file;

  public void createFile() throws Exception {
    System.out.println("You selected: Add a new file");
    file = new File(fileName);
    file.createNewFile();
  }

  public void updateFile() throws Exception {
    System.out.println("You selected: Update file");
    PrintWriter writer = new PrintWriter(fileName, "UTF-8");
    writer.println("The first line");
    if (writer != null)
      writer.close();
  }

  public void deleteFile() {
    System.out.println("You selected: Delete file");
  }

  public static void main(String[] args) {

    TextFileWriter tfw = new TextFileWriter();

    while (true) {
      // how to create a menu for users to select from
      String menu = "1. Add a new file\n2. Update file\n3. Delete file\n4. Exit";
      System.out.println(menu);

      // wait for user input
      String prompt = "\nSelect an option: ";
      System.out.print(prompt);
      Scanner scanner = new Scanner(System.in);
      int choice = scanner.nextInt();

      // process user input
      System.out.println("You selected: " + choice);
      if (choice == 1) {
        try {
          tfw.createFile();
        } catch (Exception e) {
          System.out.println("An error occurred. No file was created.");
        }
      } else if (choice == 2) {
        try {
          tfw.updateFile();
        } catch (Exception e) {
          System.out.println("An error occurred. No file was updated.");
        }
      } else if (choice == 3) {
        tfw.deleteFile();
      } else if (choice == 4) {
        System.out.println("Goodbye!");
        break;
      } else {
        System.out.printf("%d is not a valid option\n", choice);
      }
    }

  }
}
