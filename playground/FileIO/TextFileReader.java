import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;
import java.io.FileReader;
import java.io.BufferedReader;

class TextFileReader {

  public static void main(String[] args) {

    // creating a file in a directory with high level of security
    // if the app is running without root access, it will throw an exception
    // File file = new File("./secret/NewFile.txt");
    File file;
    try {
      // obtaining a file handle by creating a File object
      // file = new File("NewFile.txt");
      // if(file.exists() && file.isFile() && file.canRead()){
      // System.out.println("File exists and is readable");
      // }
      // // if the file does not exist, it will be created
      // file.createNewFile();

      // reading a file using FileInputStream
      // it reads the file byte by byte
      // FileInputStream fis = new FileInputStream("NewFile.txt");
      // FileInputStream fis = new FileInputStream(file);
      // int i;
      // while ((i = fis.read()) != -1)
      // System.out.print((char) i);

      // reading a file using Scanner
      // it reads the file line by line
      // the Scanner utility is used to read the file
      // Scanner sc = new Scanner(file);
      // while (sc.hasNextLine()) {
      // System.out.println(sc.nextLine());
      // }

      // reading a file using FileReader
      // it reads the file character by character
      // FileReader fr = new FileReader(file);
      // method 1 to read the file using char array
      // char[] a = new char[2048];
      // fr.read(a); // reads the content to the array
      // // for (char c : a)
      // // System.out.print(c); // prints the characters one by one
      // method 2 to read the file using String
      // String stringValue = new String(a);
      // System.out.println(stringValue);
      // method 3 to read the file printing the characters one by one
      // int i;
      // while ((i = fr.read()) != -1)
      // System.out.print((char) i);

      // reading a file using BufferedReader
      // one of the most efficient ways to read a file
      // it reads the file line by line
      BufferedReader br = new BufferedReader(new FileReader("SchoolDB_Initial.txt"));
      String line;
      while ((line = br.readLine()) != null) {
        if (line.isEmpty()) {
          continue;
        }
        String entity = line.substring(0, line.indexOf(":"));
        System.out.println(entity);
      }

    } catch (Exception e) {
      e.printStackTrace();
    }

  }
}
