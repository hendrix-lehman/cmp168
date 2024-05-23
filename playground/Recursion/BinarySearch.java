class BinarySearch {

  public static int binarySearch(int[] arr, int target, int startIndex, int endIndex) {
    if (startIndex > endIndex) {
      return -1; // base case the value is NOT in the array
    }
    int midpoint = (startIndex + endIndex) / 2;
    if (target == arr[midpoint]) {
      return midpoint; // base case found the target at midpoint location
    } else if (target > arr[midpoint]) {
      return binarySearch(arr, target, midpoint + 1, endIndex);// go to the higher indices
    } else {
      return binarySearch(arr, target, startIndex, midpoint - 1);// go to the lower indices
    }
  }

  public static void main(String[] args) {
    int[] arr = { 54, 59, 67, 72, 75, 82, 87, 91, 95, 99 };
    int target = 85;
    int startIndex = 0;
    int endIndex = arr.length - 1;
    int result = binarySearch(arr, target, startIndex, endIndex);
    System.out.println("Element found at index: " + result);
  }
}
