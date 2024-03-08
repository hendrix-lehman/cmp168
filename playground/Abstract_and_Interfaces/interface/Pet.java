abstract class Pet implements FoodEater {

  // properties, attributes, fields, instance variables
  private String favoriteFood;
  private String favoriteToy;
  private int maintenanceLevel;
  private boolean goesOutside;

  // constructors
  public Pet() {
    this("unknown food", "unknown toy", 0, false);
  }

  public Pet(String favoriteFood, String favoriteToy, int maintenanceLevel, boolean goesOutside) {
    this.favoriteFood = favoriteFood;
    this.favoriteToy = favoriteToy;
    this.maintenanceLevel = maintenanceLevel;
    this.goesOutside = goesOutside;
  }

  // methods, behaviors
  public abstract void play();

  public abstract void eat();

  public abstract void eat(Food f);

  public abstract double metabolizeFood(Food f);

  // All methods from the interface must be overridden
  // or the class declared abstract
  // public void eat() {
  // System.out.println("I'm eating");
  // }
  //
  // public void eat(Food f) {
  // System.out.println("I'm eating food");
  // };
  //
  // public double metabolizeFood(Food f) {
  // System.out.println("I'm metabolizing food");
  // return 0.0;
  // };

  // getters and setters for those properties, attributes, fields, instance
  // variables
  public String getFavoriteFood() {
    return favoriteFood;
  }

  public String getFavoriteToy() {
    return favoriteToy;
  }

  public int getMaintenanceLevel() {
    return maintenanceLevel;
  }

  public boolean goesOutside() {
    return goesOutside;
  }

  public void setFavoriteFood(String foodName) {
    favoriteFood = foodName;
  }

  public void setFavoriteToy(String toyName) {
    favoriteToy = toyName;
  }

  public void setGoesOutside(boolean goesOutside) {
    this.goesOutside = goesOutside;
  }

  public void setMaintenanceLevel(int level) {
    maintenanceLevel = level;
  }

  // overriding parent class methods, toString, equals
  @Override
  public String toString() {
    return "Favorite Food: " + favoriteFood + "\nFavorite Toy: " + favoriteToy + "\nMaintenance Level: "
        + maintenanceLevel
        + "\nGoes Outside: " + goesOutside;
  }

  @Override
  public boolean equals(Object o) {
    if (o instanceof Pet) {
      Pet p = (Pet) o;
      return favoriteFood.equals(p.favoriteFood) && favoriteToy.equals(p.favoriteToy)
          && maintenanceLevel == p.maintenanceLevel && goesOutside == p.goesOutside;
    }
    return false;
  }
}
