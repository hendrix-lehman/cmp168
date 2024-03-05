class Array {

  public static int sum(int[] arr) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }
    return sum;
  }

  public static void swap(int[] arr, int index1, int index2) {
    int temp = arr[index1];
    arr[index1] = arr[index2];
    arr[index2] = temp;
  }

  public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static int[] resize(int[] arr, int newSize) {
    int[] temp = new int[newSize];
    for (int i = 0; i < arr.length; i++) {
      if (i < newSize) {
        temp[i] = arr[i];
      } else {
        break;
      }
    }
    return temp;
  }

  public static int max(int[] arr) {
    int max = arr.length > 0 ? arr[0] : 0; // if arr is empty, return 0
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    return max;
  }

  public static int[] insertionSort(int[] arr) {
    for (int i = 1; i < arr.length; i++) {
      int current = arr[i];
      int j = i - 1;
      while (j >= 0 && arr[j] > current) {
        arr[j + 1] = arr[j];
        j--;
      }
      arr[j + 1] = current;
    }
    return arr;
  }

  public static void main(String[] args) {

    int[] arr = { 1, 2, 3, 4, 6 };
    System.out.println(sum(arr));

    // index 0 1 2 3 4 5 6 7 8
    int[] nums = { 20, 34, 7, 54, 78, 90, 81, 4, 19, 13 };
    print(nums);
    swap(nums, 1, 7); // swap 2 and 8
    print(nums);

    nums = resize(nums, nums.length * 2);
    // nums = resize(nums, 2);
    // System.out.println(nums.length);
    print(nums);

    int max = max(new int[0]);
    System.out.println(max);

    int[] sorted = insertionSort(nums);
    print(sorted);
  }
}
