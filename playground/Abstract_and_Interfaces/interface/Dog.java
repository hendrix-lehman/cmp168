public class Dog extends Pet implements Communicator {
  // step 1 class declaration

  // step 2 member variables are used to represent attributes
  // properties, fields, instance variables
  private String name;
  private double weight;
  private double height;
  private boolean isVaccinated;
  private int ageInDogYears;

  // constructors
  public Dog() { // step 3 default constructor is used to initialize variables to default values
    super(); // call to default constructor of the parent class
    name = "doggy Doe";
    weight = 0.0;
    height = 0.0;
    isVaccinated = false;
    ageInDogYears = 0;
  }

  public Dog(String name) {
    this(); // call to default constructor
    this.name = name;
  }

  public Dog(String name, double weight, double height) {
    this(); // call to default constructor
    this.name = name;
    this.weight = weight;
    this.height = height;
  }

  public Dog(String name, boolean isVaccinated, int age) {
    this(); // call to default constructor
    this.name = name;
    this.isVaccinated = isVaccinated;
    ageInDogYears = age;
  }

  public Dog(String name, double weight, double height, boolean isVaccinated, int age) {
    super("unknown food", "unknown toy", 0, false); // call to overloaded constructor of the parent class
    this.name = name;
    this.weight = weight;
    this.height = height;
    this.isVaccinated = isVaccinated;
    ageInDogYears = age; // notice, we do not need to specify this.ageInDogYears here
  }

  // methods, behaviors

  // implementing the abstract method from the parent class
  @Override
  public void play() { // must provide a method body to make Dog a concrete class
    System.out.println("WOOF! Let's play fetch with " + getFavoriteToy());
  }

  @Override
  public void eat() {
    System.out.println("I'm eating");
  }

  @Override
  public void eat(Food f) {
    System.out.println("I'm eating food");
  }

  @Override
  public double metabolizeFood(Food f) {
    System.out.println("I'm metabolizing food");
    return 0.0;
  }

  @Override
  public void speak(String s) { // must provide a method body to make Dog a concrete class
    System.out.println("woof " + s);
  }

  // additional behaviors
  public void speak() { // 6 behavioral method
    System.out.println("woof");
  }

  public void sit() { // 6 behavioral method
    System.out.println("I, " + name + ", will sit now.");
  }

  public void beg() { // 6 behavioral method
    System.out.println("treat for " + name + " woof please");
  }

  // helpers methods
  public int getAgeConvertedIntoHumanYears() { // 6 calculation method
    return ageInDogYears * 7;
  }

  public void gainWeight() { // 6 mutator method
    weight++;
  }

  public void growTaller() { // 6 mutator method
    height++;
  }

  // getters and setters
  // more code goes here … accessor and mutator methods… overloaded constructors
  public String getName() { // step 4 accessor method
    return name;
  }

  public void setName(String name) { // step 5 mutator method
    this.name = name;
  }

  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public boolean isVaccinated() {
    return isVaccinated;
  }

  public void setVaccinated(boolean isVaccinated) {
    this.isVaccinated = isVaccinated;
  }

  public int getAgeInDogYears() {
    return ageInDogYears;
  }

  public void setAgeInDogYears(int ageInDogYears) {
    this.ageInDogYears = ageInDogYears;
  }

  // overriding parent class methods, toString, equals
  @Override
  public String toString() {
    super.toString(); // call to toString method of the parent class
    String s = "Dog [name=" + name + ", weight=" + weight + ", height=" + height + ", ";

    if (isVaccinated) { // instead of including “true/false” in the returned String
      s += "is vaccinated";
    } else {
      s += "is not vaccinated";
    }

    s += ", ageInDogYears=" + ageInDogYears + "]";
    return s;
  }

  @Override
  public boolean equals(Object obj) {
    if (super.equals(obj) == false) { // call to equals method of the parent class
      return false;
    }
    if (obj == null) {
      return false;
    }
    if (this == obj) {
      return true;
    } // same memory address, same exact Object
    if (obj instanceof Dog) {
      Dog other = (Dog) obj; // cast other to Dog
      if (ageInDogYears == other.ageInDogYears) {
        if (Math.abs(height - other.height) < 0.5) { // absolute value use accuracy range
          if (Math.abs(weight - other.weight) < 0.5) { // absolute value use accuracy range
            if (isVaccinated == other.isVaccinated) {
              if ((name != null) && (other.name != null)) { // check name is not null
                if (name.equals(other.name)) { // it is safe to call equals method on name
                  return true;
                }
              }
            }
          }
        }
      }
    }
    return false;
  }
}
