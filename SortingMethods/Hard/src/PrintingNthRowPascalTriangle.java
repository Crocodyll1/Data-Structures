import java.util.*;

public class PrintingNthRowPascalTriangle {
    public static void Element(int row){
        int ans = 1;
        System.out.print(ans+" ");

        for(int i =1; i<row; i++){
            ans = ans * (row-i);
            ans = ans/i;
            System.out.print(ans + " ");
        }
    }

    public static void main(String[] args) {
        Element(7);
    }
}

/*
Approach:
- The first element of every row in Pascal's Triangle is 1.
- Each next element can be generated from the previous one using:

      next = current * (row - i) / i

- Start with ans = 1 and print it.
- Iterate from i = 1 to row - 1:
    1. Compute the next element using the above formula.
    2. Print the element.

Example (row = 6):
1 -> 5 -> 10 -> 10 -> 5 -> 1

Time Complexity: O(row)
Space Complexity: O(1)
*/