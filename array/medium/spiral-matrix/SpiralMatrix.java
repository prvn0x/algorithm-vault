import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class SpiralMatrix {

    /**
     * Returns all elements of the matrix in spiral order.
     *
     * @param matrix the input m x n matrix
     * @return list of elements in spiral order
     */
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> result = new ArrayList<>();

        int left = 0;
        int right = matrix[0].length - 1;
        int top = 0;
        int bottom = matrix.length - 1;

        while (left <= right && top <= bottom){

            // need to print the first row
            for (int i = left; i <= right; i++){
                result.add(matrix[top][i]);
            }
            top++;

            // need to print from top to bottom
            for (int i = top; i <= bottom; i++){
                result.add(matrix[i][right]);
            }
            right--;

            if (top > bottom) break;

            // need to print from right to left
            for (int i = right; i >= left ; i--){
                result.add(matrix[bottom][i]);
            }
            bottom--;

            if (left > right) break;

            // need to print from bottom to top
            for (int i = bottom; i >= top ; i--){
                result.add(matrix[i][left]);
            }
            left++;
        }

        return result;
    }

    public static void main(String[] args) {
        SpiralMatrix solution = new SpiralMatrix();

        // Test Case 1
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("Test Case 1:");
        System.out.println("Input: " + Arrays.deepToString(matrix1));
        System.out.println("Output: " + solution.spiralOrder(matrix1));
        System.out.println("Expected: [1, 2, 3, 6, 9, 8, 7, 4, 5]");
        System.out.println();

        // Test Case 2
        int[][] matrix2 = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };
        System.out.println("Test Case 2:");
        System.out.println("Input: " + Arrays.deepToString(matrix2));
        System.out.println("Output: " + solution.spiralOrder(matrix2));
        System.out.println("Expected: [1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7]");
        System.out.println();

        // Test Case 3 - Single row
        int[][] matrix3 = {{1, 2, 3, 4}};
        System.out.println("Test Case 3:");
        System.out.println("Input: " + Arrays.deepToString(matrix3));
        System.out.println("Output: " + solution.spiralOrder(matrix3));
        System.out.println("Expected: [1, 2, 3, 4]");
        System.out.println();

        // Test Case 4 - Single column
        int[][] matrix4 = {{1}, {2}, {3}, {4}};
        System.out.println("Test Case 4:");
        System.out.println("Input: " + Arrays.deepToString(matrix4));
        System.out.println("Output: " + solution.spiralOrder(matrix4));
        System.out.println("Expected: [1, 2, 3, 4]");
    }
}
