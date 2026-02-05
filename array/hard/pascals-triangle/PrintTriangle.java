import java.util.ArrayList;
import java.util.List;

public class PrintTriangle {

    /**
     * Generates the first numRows of Pascal's Triangle.
     *
     * @param numRows the number of rows to generate
     * @return list of lists representing Pascal's Triangle
     */
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> completePascals = new ArrayList<>();

        for (int rowIndex = 0; rowIndex < numRows; rowIndex++){
            List<Integer> output = new ArrayList<>();

            output.add(1);
            int result = 1;

            for (int i = 1; i <= rowIndex; i++){
                result = (result * (rowIndex - i + 1)) / i;
                output.add(result);
            }
            completePascals.add(output);
        }

        return completePascals;
    }

    public static void main(String[] args) {
        PrintTriangle solution = new PrintTriangle();

        // Test Case 1
        System.out.println("Test Case 1:");
        System.out.println("Input: numRows = 5");
        System.out.println("Output: " + solution.generate(5));
        System.out.println("Expected: [[1], [1,1], [1,2,1], [1,3,3,1], [1,4,6,4,1]]");
        System.out.println();

        // Test Case 2
        System.out.println("Test Case 2:");
        System.out.println("Input: numRows = 1");
        System.out.println("Output: " + solution.generate(1));
        System.out.println("Expected: [[1]]");
        System.out.println();

        // Test Case 3
        System.out.println("Test Case 3:");
        System.out.println("Input: numRows = 3");
        System.out.println("Output: " + solution.generate(3));
        System.out.println("Expected: [[1], [1,1], [1,2,1]]");
        System.out.println();

        // Test Case 4
        System.out.println("Test Case 4:");
        System.out.println("Input: numRows = 7");
        System.out.println("Output: " + solution.generate(7));
        System.out.println("Expected: [[1], [1,1], [1,2,1], [1,3,3,1], [1,4,6,4,1], [1,5,10,10,5,1], [1,6,15,20,15,6,1]]");
        System.out.println();

        // Test Case 5 - Visualize the triangle
        System.out.println("Test Case 5 - Visualized:");
        System.out.println("Input: numRows = 6");
        List<List<Integer>> triangle = solution.generate(6);
        System.out.println("Output:");
        for (List<Integer> row : triangle) {
            System.out.println(row);
        }
    }
}
