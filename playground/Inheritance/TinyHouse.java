// A TinyHouse "is-a" House, so it should inherit from House. 
class TinyHouse extends House {

  private boolean hasRoofTop;

  // override the constructor
  public TinyHouse(String color) {
    super("blue", 1, 1);
    setHasGarage(false);
  }

  public boolean isMoving() {
    return true;
  }

  @Override
  public void printHouseInfo() {
    System.out.printf("TinyHouse has %d bedroom(s) and %d bathrooms.\n", getNumBedrooms(), getNumBathrooms());
  }

}
