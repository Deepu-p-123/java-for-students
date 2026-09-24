/*
 * TwoDimensionalArray.java
 * Demonstrates declaring, initializing, and traversing a 2D array (matrix).
 */
public class TwoDimensionalArray {
    public static void main(String[] args) {
        // 3x3 matrix
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Printing the matrix
        System.out.println("Matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Calculating sum of all elements
        int sum = 0;
        for (int[] row : matrix) {
            for (int value : row) {
                sum += value;
            }
        }
        System.out.println("\nSum of all elements: " + sum);

        // Transposing the matrix
        int[][] transpose = new int[3][3];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        System.out.println("\nTransposed Matrix:");
        for (int[] row : transpose) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
