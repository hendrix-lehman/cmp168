class App {

  public static void main(String[] args) {
    // create a new House object
    House house = new House("white");
    System.out.printf("House color is %s. Has garage: %b \n", house.getColor(), house.hasGarage()); // white

    // create a new TinyHouse object
    TinyHouse tinyHouse = new TinyHouse("blue");
    System.out.printf("TinyHouse color is %s. Has garage: %b \n", tinyHouse.getColor(), tinyHouse.hasGarage()); // white

    house.printHouseInfo();
    tinyHouse.printHouseInfo();
  }
}
