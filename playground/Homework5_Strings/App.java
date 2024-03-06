class App {

  public static void main(String[] args) {

    String fruit = "tomato";
    int calories = 22;

    String formattedText = String.format("Food - name: %10s | calories: %4d", fruit, calories);
    System.out.println(formattedText);

    // or
    System.out.printf("Food - name: %10s | calories: %4d", fruit, calories);
    System.out.println();

    String formattedText2 = String.format(
        "Course: %3s-%3d | Number of Credits: %02d  | Graduate/Undergraduate", "CS",
        180, 3);
    System.out.println(formattedText2);
  }

}
