class App {
  /**
   * 
   * In the main method of the Tester class, do the following:
   * 
   * Iterate through the array and print the content of each element by using the
   * toString() method
   * 
   * Call the play method on each element to see the behavior
   * 
   * Call the eat() method on each element to see the behavior
   * 
   * Call the eat(Food f) method on each element to see the behavior
   * 
   * Call the metabolizeFood(Food f) method on each element to see the behavior
   * (notice Cat and Dog metabolisms differ)
   * 
   * 
   * 
   */

  public static void main(String[] args) {
    Pet[] pets = new Pet[4];
    pets[0] = new Cat();
    pets[1] = new Dog();
    pets[2] = new Cat();
    pets[3] = new Dog();

    for (Pet pet : pets) {
      if (pet instanceof Cat) {
        System.out.println("This is a cat");
      } else if (pet instanceof Dog) {
        System.out.println("This is a dog");
      } else {
        System.out.println("Unknown pet type");
      }
      // System.out.println(pet.toString());
      // pet.play();
      // pet.eat();
      // pet.eat(new Food("Purina", 100, 10));
      // pet.metabolizeFood(new Food("Purina", 100, 10));
    }
  }
}
