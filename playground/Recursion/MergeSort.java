class MergeSort {

  public static void mergeSort(int[] arr) {
    if (arr.length > 1) {
      int half = arr.length / 2;
      int[] left = new int[half];
      int[] right = new int[arr.length - half]; // if odd, right will be bigger

      split(arr, left, right); // split populates left and right arrays

      mergeSort(left);
      mergeSort(right);

      merge(arr, left, right);
    }
  }

  public static void split(int[] arr, int[] left, int[] right) {
    for (int i = 0; i < left.length; i++) {
      left[i] = arr[i];
    }

    for (int i = 0; i < right.length; i++) {
      right[i] = arr[i + left.length];
    }
  }

  public static void merge(int[] arr, int[] left, int[] right) {
    int i = 0;
    int j = 0;
    int k = 0;

    while (i < left.length && j < right.length) {
      if (left[i] < right[j]) {
        arr[k] = left[i];
        i++;
      } else {
        arr[k] = right[j];
        j++;
      }
      k++;
    }

    while (i < left.length) {
      arr[k] = left[i];
      i++;
      k++;
    }

    while (j < right.length) {
      arr[k] = right[j];
      j++;
      k++;
    }
  }

  public static void printArray(int[] arr) {
    for (int i : arr) {
      System.out.print(i + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    int[] arr = { 87, 82, 74, 99, 91, 95, 72, 54, 67 };
    System.out.println("Given Array");
    printArray(arr);
    mergeSort(arr);
    System.out.println("\nSorted array");
    printArray(arr);
  }
}
