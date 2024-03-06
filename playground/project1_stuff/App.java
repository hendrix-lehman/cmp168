class App {

  public static void main(String[] args) {

    Dummy d1 = new Dummy();

    // test our class
    if (d1.getId() == 0) {
      System.out.println("getId() works");
    } else {
      System.out.println("getId() does not work");
    }

    if (d1.getName().equals("Dummy")) {
      System.out.println("getName() works");
    } else {
      System.out.println("getName() does not work");
    }

    if (d1.getFavoriteNumbers().length == 5) {
      System.out.println("getFavoriteNumbers() works");
    } else {
      System.out.println("getFavoriteNumbers() does not work");
    }

    if (d1.getNumberOfFavoriteNumbers() == 0) {
      System.out.println("getNumberOfFavoriteNumbers() works");
    } else {
      System.out.println("getNumberOfFavoriteNumbers() does not work");
    }

    d1.addFavoriteNumber(1);
    d1.addFavoriteNumber(2);
    d1.addFavoriteNumber(3);
    d1.addFavoriteNumber(4);
    d1.addFavoriteNumber(5);
    d1.addFavoriteNumber(6);
    d1.addFavoriteNumber(7);

    if (d1.getNumberOfFavoriteNumbers() == 7) {
      System.out.println("addFavoriteNumber() works");
    } else {
      System.out.println("addFavoriteNumber() does not work");
    }

    if (d1.getFavoriteNumbers()[0] == 1 && d1.getFavoriteNumbers()[1] == 2 && d1.getFavoriteNumbers()[2] == 3) {
      System.out.println("addFavoriteNumber() works");
    } else {
      System.out.println("addFavoriteNumber() does not work");
    }

    // check toString()
    if (d1.toString().equals("Dummy [name=      Dummy id= 0]")) {
      System.out.println("toString() works");
    } else {
      System.out.println("toString() does not work");
    }

    // check equals()
    Dummy d2 = new Dummy();
    if (d1.equals(d2)) {
      System.out.println("equals() works");
    } else {
      System.out.println("equals() does not work");
    }

    d2.setName("OTHER");
    if (d1.equals(d2)) {
      System.out.println("equals() does not work");
    } else {
      System.out.println("equals() works");
    }

    if (d1.equals(null)) {
      System.out.println("equals() does not work");
    } else {
      System.out.println("equals() works");
    }

    // check compareTo()
    if (d1.compareTo(d2) == 0) {
      System.out.println("compareTo() works");
    } else {
      System.out.println("compareTo() does not work");
    }

  }
}
