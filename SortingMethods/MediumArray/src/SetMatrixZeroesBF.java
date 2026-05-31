public class SetMatrixZeroesBF {
    public static void SetZeroes(int[][] nums){
        int n = nums.length;
        int m = nums[0].length;

        for(int i =0; i < n; i++){
            for(int j = 0; j<m; j++){
                if(nums[i][j] == 0){
                    //mark rows
                    for(int k =0; k<m; k++){
                        if(nums[i][k] != 0){
                            nums[i][k] = -1;
                        }
                    }
                    //mark columns
                    for(int l =0; l<m; l++){
                        if(nums[l][j] != 0){
                            nums[l][j] = -1;
                        }
                    }
                }
            }
        }
        //convert -1 to 0
        for(int i=0; i<n; i++){
            for(int j = 0; j<m; j++){
                if(nums[i][j] == -1){
                    nums[i][j] = 0;
                }
            }
        }
    }
    public static void printMatrix(int[][] nums){
        for(int[] rows : nums){
            for(int num : rows){
                System.out.print( num + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] nums = {
                {1,3,2},
                {2,0,4},
                {9,7,0}
        };

        System.out.println("Matrix Before : ");
        printMatrix(nums);

        SetZeroes(nums);

        System.out.println("Matrix after Setting zeroes : ");
        printMatrix(nums);
    }


}

/*
Interview Explanation

For Set Matrix Zeroes:

Input: int[][] matrix
Output: Modify the same matrix.
Therefore, void is preferred.
Space complexity stays lower because we don't create another matrix.

Approach (Brute Force)
Traverse the matrix.
Whenever you find a 0, mark its entire row and column with a special value (e.g., -1) that doesn't already exist in the matrix.
After traversal, convert all -1 values to 0.
Time & Space Complexity
Time Complexity: O((N * M) * (N + M))
Space Complexity: O(1)
 */
