import java.util.*;

public class PrintTheMatrixInSpiralManner {


    public static List<Integer> spiralOrder(int[][] matrix) {

            List<Integer> ans = new ArrayList<>();

            int top = 0;
            int bottom = matrix.length - 1;
            int left = 0;
            int right = matrix[0].length - 1;

            while (top <= bottom && left <= right) {

                // Left -> Right
                for (int i = left; i <= right; i++) {
                    ans.add(matrix[top][i]);
                }
                top++;

                // Top -> Bottom
                for (int i = top; i <= bottom; i++) {
                    ans.add(matrix[i][right]);
                }
                right--;

                // Right -> Left
                if (top <= bottom) {
                    for (int i = right; i >= left; i--) {
                        ans.add(matrix[bottom][i]);
                    }
                    bottom--;
                }

                // Bottom -> Top
                if (left <= right) {
                    for (int i = bottom; i >= top; i--) {
                        ans.add(matrix[i][left]);
                    }
                    left++;
                }
            }

            return ans;
    }


    public static void main(String[] args) {

        int[][] matrix = {
                {1, 1, 1},
                {2, 2, 2},
                {3, 3, 3}
        };
        System.out.println(spiralOrder(matrix));


    }
}
/*
Optimal Approach:

Maintain four boundaries:
        1. top    -> starting row
2. bottom -> ending row
3. left   -> starting column
4. right  -> ending column

Traverse the matrix layer by layer:
        1. Traverse left to right along the top row.
        2. Traverse top to bottom along the right column.
        3. Traverse right to left along the bottom row (if top <= bottom).
        4. Traverse bottom to top along the left column (if left <= right).

After each traversal, shrink the corresponding boundary.

Continue until all elements are visited.

TC: O(N × M)
SC: O(1)  (excluding the output list)
        */