class Dummy implements Comparable<Dummy> {

  // UML for this class
  // - name: String
  // - id: int
  // - favoriteNumbers: int[]
  // + Dummy() // default id = 0, name = "Dummy", favoriteNumbers size of 5
  // + Dummy(int, String, int) // overloaded constructor with id, name and size of
  // favoriteNumbers
  // + getId(): int
  // + getName(): String
  // + setName(String): void
  // + getFavoriteNumbers(): int[]
  // + doSomething(): void
  // + addFavoriteNumber(int): void
  // + addFavoriteNumbers(int[]): void
  // + getNumberOfFavoriteNumbers(): int
  // + toString(): String // returns "Dummy [name= %10s id= %d]"
  // + equals(Object): boolean // equals if all attributes are the same
  // + compareTo(Dummy): int // compares sorting by id

  // attributes
  private String name;
  private int id;
  private int[] favoriteNumbers;

  // create a private variable to keep track of the last index
  private int currentIndex = 0;

  // constructors
  public Dummy() { // default constructor
    this.id = 0;
    this.name = "Dummy";
    this.favoriteNumbers = new int[5];
  }

  public Dummy(int id, String name, int sizeOfFavoriteNumbers) { // overloaded constructor
    this.id = id;
    this.name = name;
    this.favoriteNumbers = new int[sizeOfFavoriteNumbers];
  }

  // getters and setters
  public int getId() {
    return this.id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int[] getFavoriteNumbers() {
    return this.favoriteNumbers;
  }

  public int getNumberOfFavoriteNumbers() {
    return this.currentIndex;
  }

  // behaviors and other methods
  public void doSomething() {
    System.out.println("Doing something...");
  }

  private void resizeArray() {
    // create a new array with a size of the double of the current array
    int[] newArray = new int[this.favoriteNumbers.length * 2];
    // copy the elements from the old array to the new array
    for (int i = 0; i < this.favoriteNumbers.length; i++) {
      newArray[i] = this.favoriteNumbers[i];
    }
    // assign the new array to the old array
    this.favoriteNumbers = newArray;
  }

  public void addFavoriteNumber(int number) {
    // things to AVOID
    // - do not overwrite values in the array
    // - do not go out of bounds. That's when the index is less than 0
    // or greater than the length of the array

    // this is NOT going to work because it overwrites the first element
    // every time this method is called
    // this.favoriteNumbers[0] = number;
    // this.currentIndex++;

    // we need some way to keep track of the current index
    // so, we created a private variable currentIndex
    // this.favoriteNumbers[this.currentIndex] = number;
    // this.currentIndex++;
    // so, this does not work either because we are not checking if the
    // currentIndex is less than the length of the array

    // we need to check if the currentIndex is less than the length of the array
    if (this.currentIndex == this.favoriteNumbers.length) {
      resizeArray();
      // } else {
      // // this does not work because we still need to add the number.
      // // We can resize the array and add the number
    }
    this.favoriteNumbers[this.currentIndex] = number;
    this.currentIndex++;

  }

  // overrides
  @Override
  public String toString() {
    // return "Dummy [name= %10s id= %d]";
    return String.format("Dummy [name= %10s id= %d]", this.name, this.id);
  }

  // equals
  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    if (this == obj) {
      return true;
    }
    if (obj instanceof Dummy) {
      Dummy other = (Dummy) obj;
      return this.name.equals(other.name) && this.id == other.id;
    }
    return false;
  }

  // compareTo
  @Override
  public int compareTo(Dummy other) {
    if (this.id < other.id) {
      return -1;
    }
    if (this.id > other.id) {
      return 1;
    }
    return 0;
  }

}
