
// Create a concrete class Food
// name: String
// calories : int
// portionSizeInOunces : int
//
// Food(String name, int calories, int portionSizeInOunces)
//
// getName() : String
// getCalories() : int
// getPortionSizeInOunces() : int
//
// toString() : String
// equals(Object o) : boolean
class Food {

  private String name;
  private int calories;
  private int portionSizeInOunces;

  public Food(String name, int calories, int portionSizeInOunces) {
    this.name = name;
    this.calories = calories;
    this.portionSizeInOunces = portionSizeInOunces;
  }

  public String getName() {
    return name;
  }

  public int getCalories() {
    return calories;
  }

  public int getPortionSizeInOunces() {
    return portionSizeInOunces;
  }

  @Override
  public String toString() {
    return "Name: " + name + "\nCalories: " + calories + "\nPortion Size: " + portionSizeInOunces;
  }

  @Override
  public boolean equals(Object o) {
    if (o instanceof Food) {
      Food f = (Food) o;
      return name.equals(f.name) && calories == f.calories && portionSizeInOunces == f.portionSizeInOunces;
    }
    return false;
  }

}
