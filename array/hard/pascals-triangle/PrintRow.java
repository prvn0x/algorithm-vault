import java.util.ArrayList;
import java.util.List;

public class PrintRow {

    /**
     * Returns the nth row of Pascal's Triangle (0-indexed).
     *
     * @param rowIndex the row index (0-indexed)
     * @return list containing the nth row of Pascal's Triangle
     */
    public List<Integer> getRow(int rowIndex) {

        ArrayList<Integer> output = new ArrayList<>();

        output.add(1);

        int result = 1;

        for (int i = 1; i <= rowIndex; i++){
            result = (result * (rowIndex - i + 1)) / i;
            output.add(result);
        }

        return output;
    }

    public static void main(String[] args) {
        PrintRow solution = new PrintRow();

        // Test Case 1
        System.out.println("Test Case 1:");
        System.out.println("Input: rowIndex = 3");
        System.out.println("Output: " + solution.getRow(3));
        System.out.println("Expected: [1, 3, 3, 1]");
        System.out.println();

        // Test Case 2
        System.out.println("Test Case 2:");
        System.out.println("Input: rowIndex = 0");
        System.out.println("Output: " + solution.getRow(0));
        System.out.println("Expected: [1]");
        System.out.println();

        // Test Case 3
        System.out.println("Test Case 3:");
        System.out.println("Input: rowIndex = 1");
        System.out.println("Output: " + solution.getRow(1));
        System.out.println("Expected: [1, 1]");
        System.out.println();

        // Test Case 4
        System.out.println("Test Case 4:");
        System.out.println("Input: rowIndex = 5");
        System.out.println("Output: " + solution.getRow(5));
        System.out.println("Expected: [1, 5, 10, 10, 5, 1]");
        System.out.println();

        // Test Case 5
        System.out.println("Test Case 5:");
        System.out.println("Input: rowIndex = 7");
        System.out.println("Output: " + solution.getRow(7));
        System.out.println("Expected: [1, 7, 21, 35, 35, 21, 7, 1]");
    }
}
