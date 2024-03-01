class App {

  public static void testPlayImplementation(Pet pet) {
    pet.play();
  }

  public static void testDogGainWeight() {
    Dog dog = new Dog();
    dog.setWeight(5.0);
    if (dog.getWeight() == 5.0) {
      System.out.println("Dog gainWeight works");
    } else {
      System.out.println("Dog gainWeight does not work");
    }
    dog.gainWeight();
    if (dog.getWeight() == 6.0) {
      System.out.println("Dog gainWeight works");
    } else {
      System.out.println("Dog gainWeight does not work");
    }
  }

  public static void main(String[] args) {
    Dog dog = new Dog();

    // a default Dog should have these attributes
    if (dog.getName().equals("doggy Doe")
        && dog.getWeight() == 0.0
        && dog.getHeight() == 0.0
        && !dog.isVaccinated()
        && dog.getAgeInDogYears() == 0
        && dog.getFavoriteFood().equals("unknown food")
        && dog.getFavoriteToy().equals("unknown toy")
        && dog.getMaintenanceLevel() == 0
        && !dog.goesOutside()) {
      System.out.println("Dog default constructor works");
    } else {
      System.out.println("Dog default constructor does not work");
    }

    // testPlayImplementation(dog);
    testDogGainWeight();

    // Test the Cat class
    Cat cat = new Cat();
    if (cat.getNumWhiskers() == 0
        && cat.getWhiskerLength() == 0.0
        && cat.getAge() == 0
        && !cat.getIsVaccinated()
        && cat.getName().equals("unknown")
        && cat.getFavoriteFood().equals("unknown food")
        && cat.getFavoriteToy().equals("unknown toy")
        && cat.getMaintenanceLevel() == 0
        && !cat.goesOutside()) {
      System.out.println("Cat default constructor works");
    } else {
      System.out.println("Cat default constructor does not work");
    }
    // testPlayImplementation(cat);
    System.out.printf("Cat: %s\n", cat);
    // System.out.printf("Dog: %s\n", dog);

    Pet[] pets = { dog, cat };
    for (Pet pet : pets) {
      testPlayImplementation(pet);
      if (pet instanceof Dog) {
        System.out.println("This is a dog");
        Dog d = (Dog) pet;
        // d.toString();
        System.out.println(d.toString());
      } else {
        System.out.println("This is a cat");
        Cat c = (Cat) pet;
        // c.toString();
        System.out.println(c);
      }
    }

  }
}
