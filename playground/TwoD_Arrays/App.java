class App {

  public static void main(String[] args) {
    // Let's think about a one-dimensional array
    // type[] <identifier> = new type[<size>];
    // so, here's an example
    // int[] numbers = new int[5];
    // this will create an array of integers with 5 elements
    // the index of the first element is 0
    // the index of the last element is 4
    // so, to access the first element, you would do numbers[0]
    // to access the last element, you would do numbers[4]
    // update the value of the first element
    // numbers[0] = 10;

    // Let's create an array of integers
    // I can initialize the array with values
    int[] numbers = { 8, 5, 2, 6, 9 };
    for (int i = 0; i < numbers.length; i++) {
      System.out.printf("numbers[%d] = %d\n", i, numbers[i]);
    }

    // How is this different from a two-dimensional array?
    // type[][] <identifier> = new type[<rows>][<columns>];
    // so, here's an example
    // int[][] matrix = new int[3][3];
    // this will create a 3x3 matrix
    // the first index is the row 0 and the second index is the column 0
    // the last row is 2 and the last column is 2
    // so, to access the first element, you would do matrix[0][0]
    // to access the last element, you would do matrix[2][2]
    // update the value of the first element
    // matrix[0][0] = 10;

    // Let's create a 3x3 matrix
    // I can initialize the matrix with values
    int[][] matrix = { { 6, 3, 4 }, { 9, 5, 7 }, { 1, 8, 2 } };
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        System.out.printf("matrix[%d][%d] = %d\n", i, j, matrix[i][j]);
      }
    }

  }
}
