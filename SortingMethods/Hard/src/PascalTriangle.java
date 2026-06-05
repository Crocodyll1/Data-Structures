public class PascalTriangle {
    public static int element(int row, int col){
        int result = 1;
        for(int i =0; i<col-1; i++){
            result = result * (row-i);
            result = result /(i+1);
        }
        return result;
    }

    public static void main(String[] args) {

        int ans = element(4,3);
        System.out.println("Element at row 4 and column 3 in Pascls Tringle is : "+ans);
    }
}
/*
Approach:
- In Pascal's Triangle, the element at a given row and column can be calculated
  using the Combination formula:

      C(row - 1, col - 1)

- Instead of calculating factorials (which is costly and may cause overflow),
  we directly compute nCr using the formula:

      nCr = (n * (n - 1) * ... ) / (1 * 2 * ...)

- Initialize result = 1.
- Iterate from i = 0 to col - 2:
    1. Multiply result by (row - i).
    2. Divide result by (i + 1).
- Return the final result.

Example:
row = 4, col = 3

Element = C(3, 2)
        = (4 × 3) / (1 × 2)
        = 6

Time Complexity: O(col)
Space Complexity: O(1)
*/
