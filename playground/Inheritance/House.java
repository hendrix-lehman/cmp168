// Purpose: This class is a blueprint for a house object.
// It is the parent class of TinyHouse.
class House {
  // attributes
  private String color;
  private int numBedrooms;
  private int numBathrooms;
  private boolean hasGarage;

  // constructor
  public House(String color) {
    System.out.println("House(String) constructor");
    this.color = color;
    this.numBedrooms = 3;
    this.numBathrooms = 2;
    this.hasGarage = true;
  }

  protected House(String color, int numBedrooms, int numBathrooms) {
    System.out.println("House(String, int, int) constructor");
    this.color = color;
    this.numBedrooms = numBedrooms;
    this.numBathrooms = numBathrooms;
  }

  // methods (getters and setters)
  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public int getNumBedrooms() {
    return numBedrooms;
  }

  public void setNumBedrooms(int numBedrooms) {
    this.numBedrooms = numBedrooms;
  }

  public int getNumBathrooms() {
    return numBathrooms;
  }

  public void setNumBathrooms(int numBathrooms) {
    this.numBathrooms = numBathrooms;
  }

  public boolean hasGarage() {
    return hasGarage;
  }

  public void setHasGarage(boolean hasGarage) {
    this.hasGarage = hasGarage;
  }

  public void printHouseInfo() {
    System.out.printf("House has %d bedroom(s) and %d bathrooms.\n", getNumBedrooms(), getNumBathrooms());
  }

}
