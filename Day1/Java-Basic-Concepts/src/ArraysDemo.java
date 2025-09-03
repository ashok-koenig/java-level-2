public class ArraysDemo {
    public static void main(String[] args) {
        // 1D Array
        int[] numbers = {10, 20, 30, 40};
        System.out.println("Elements in the 1D Array: ");
        for(int i=0; i< numbers.length; i++){
            System.out.println(numbers[i]);
        }

        // 2D array
        int[][] matrix = {    {1, 2},    {3, 4},    {5, 6}  };
        System.out.println("Matrix using 2D array: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
