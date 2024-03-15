import java.io.File;
import java.io.FileInputStream;

class App {

  public static void main(String[] args) {

    // creating a file in a directory with high level of security
    // if the app is running without root access, it will throw an exception
    // File file = new File("./secret/NewFile.txt");
    File file;
    try {
      file = new File("NewFile.txt");
      file.createNewFile();
      FileInputStream fis = new FileInputStream(file);
      char c;
    } catch (Exception e) {
      e.printStackTrace();
    }

  }
}
