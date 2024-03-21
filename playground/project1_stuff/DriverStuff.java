import java.io.BufferedReader;
import java.io.FileReader;

class DriverStuff {

  public static void main(String[] args) {
    // read from file
    String filename = "input.txt";
    BufferedReader br = null;

    try {
      br = new BufferedReader(new FileReader(filename));
      String line;
      while ((line = br.readLine()) != null) {
        // from this line, figure out what's the object to create
        // and what values to pass to the constructor
        String entity = line.substring(0, line.indexOf(":"));
        if (entity.equals("Stuff")) {
          // create Stuff object
          // but first, get the constructor arguments
          String[] params = line.substring(line.indexOf(":") + 1).split(",");
          System.out.println(params[0].trim().length());
          if (params[0].trim().length() == 0) {
            Stuff stuff = new Stuff();
            System.out.println(stuff);
          } else {
            int id = Integer.parseInt(params[0].trim());
            String name = params[1];
            Stuff stuff = new Stuff(id, name);
            System.out.println(stuff);
          }
        }
      }
    } catch (Exception e) {
      System.out.println("Error found");
      e.printStackTrace();
    } finally {
      try {
        if (br != null) {
          br.close();
        }
      } catch (Exception e) {
        System.out.println("Error closing file");
      }
    }
  }
}
