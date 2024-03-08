class Cat extends Pet {

  // properties, attributes, fields, instance variables
  private int numWhiskers;
  private double whiskerLength;
  private int age;
  private boolean isVaccinated;
  private String name;

  // constructors
  public Cat() {
    super();
    numWhiskers = 0;
    whiskerLength = 0.0;
    age = 0;
    isVaccinated = false;
    name = "unknown";
  }

  // implementing the abstract method from the parent class
  @Override
  public void play() {
    System.out.println("Meow! Let's play with " + getFavoriteToy());
  }

  @Override
  public void eat() {
    System.out.println("CAT: - I'm eating");
  }

  @Override
  public void eat(Food f) {
    System.out.println("CAT: - I'm eating food");
  }

  @Override
  public double metabolizeFood(Food f) {
    System.out.println("CAT: - I'm metabolizing food");
    return 0.0;
  }

  // getters and setters for those properties, attributes, fields, instance

  public int getNumWhiskers() {
    return numWhiskers;
  }

  public double getWhiskerLength() {
    return whiskerLength;
  }

  public int getAge() {
    return age;
  }

  public boolean getIsVaccinated() {
    return isVaccinated;
  }

  public String getName() {
    return name;
  }

  public void setNumWhiskers(int whiskers) {
    numWhiskers = whiskers;
  }

  public void setWhiskerLength(double length) {
    whiskerLength = length;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setIsVaccinated(boolean isVaccinated) {
    this.isVaccinated = isVaccinated;
  }

  public void setName(String name) {
    this.name = name;
  }

  // overriding parent class methods, toString, equals
  @Override
  public String toString() {
    return "Cat [numWhiskers=" + numWhiskers + ", whiskerLength=" + whiskerLength + ", age=" + age + ", isVaccinated="
        + isVaccinated + ", name=" + name + ", favoriteFood=" + getFavoriteFood() + ", favoriteToy=" + getFavoriteToy()
        + ", maintenanceLevel=" + getMaintenanceLevel() + ", goesOutside=" + goesOutside() + "]";
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!super.equals(obj))
      return false;
    if (getClass() != obj.getClass())
      return false;
    Cat other = (Cat) obj;
    if (age != other.age)
      return false;
    if (isVaccinated != other.isVaccinated)
      return false;
    if (name == null) {
      if (other.name != null)
        return false;
    } else if (!name.equals(other.name))
      return false;
    if (numWhiskers != other.numWhiskers)
      return false;
    if (Double.doubleToLongBits(whiskerLength) != Double.doubleToLongBits(other.whiskerLength))
      return false;
    return true;
  }
}
