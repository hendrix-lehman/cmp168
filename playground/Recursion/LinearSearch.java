class LinearSearch {

  // recursive function to search x in arr[l..r]
  public static int recSearch(int arr[], int target, int index) {
    if (index < 0 || index >= arr.length) { // base case 1, if index is out of bounds. Not Found.
      return -1;
    }
    if (arr[index] == target) { // base case 2, if target is found in the array. Found.
      return index;
    }
    return recSearch(arr, target, index + 1); // recursive call
  }

  public static void main(String[] args) {

    int[] arr = { 82, 87, 75, 99, 91, 95, 72, 54 };
    int target = 99;
    int currentIndex = 0;
    int result = recSearch(arr, target, currentIndex);
    System.out.println("Element found at index (-1 = Not Found): " + result);

  }
}
