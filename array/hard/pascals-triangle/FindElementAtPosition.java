public class FindElementAtPosition {

    /**
     * Finds the element at position (row, col) in Pascal's Triangle.
     * Uses 1-indexed positions (row and col start from 1).
     *
     * @param row the row number (1-indexed)
     * @param col the column number (1-indexed)
     * @return the element at the given position
     */
    public int findElement(int row, int col) {
        int numerator = 1;
        int denominator = 1;

        row -= 1;
        col -= 1;

        for (int i = 0; i < col; i++){
            numerator *= row;
            row--;
        }

        for (int i = 1; i <= col; i++){
            denominator *= i;
        }

        return numerator / denominator;
    }

    public static void main(String[] args) {
        FindElementAtPosition solution = new FindElementAtPosition();

        // Test Case 1
        System.out.println("Test Case 1:");
        System.out.println("Input: row = 5, col = 3");
        System.out.println("Output: " + solution.findElement(5, 3));
        System.out.println("Expected: 6");
        System.out.println();

        // Test Case 2
        System.out.println("Test Case 2:");
        System.out.println("Input: row = 6, col = 3");
        System.out.println("Output: " + solution.findElement(6, 3));
        System.out.println("Expected: 10");
        System.out.println();

        // Test Case 3 - First element
        System.out.println("Test Case 3:");
        System.out.println("Input: row = 4, col = 1");
        System.out.println("Output: " + solution.findElement(4, 1));
        System.out.println("Expected: 1");
        System.out.println();

        // Test Case 4 - Last element
        System.out.println("Test Case 4:");
        System.out.println("Input: row = 4, col = 4");
        System.out.println("Output: " + solution.findElement(4, 4));
        System.out.println("Expected: 1");
        System.out.println();

        // Test Case 5
        System.out.println("Test Case 5:");
        System.out.println("Input: row = 7, col = 4");
        System.out.println("Output: " + solution.findElement(7, 4));
        System.out.println("Expected: 20");
    }
}
