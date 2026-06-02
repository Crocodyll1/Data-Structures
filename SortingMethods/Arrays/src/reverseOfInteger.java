public class reverseOfInteger {
    public static  int reverse(int x) {
        int rev = 0;

        while (x != 0) {
            int lastdigit = x % 10;
            x = x / 10;

            if (rev > Integer.MAX_VALUE / 10 ||
                    (rev == Integer.MAX_VALUE / 10 && lastdigit > 7)) {
                return 0;
            }

            if (rev < Integer.MIN_VALUE / 10 ||
                    (rev == Integer.MIN_VALUE / 10 && lastdigit < -8)) {
                return 0;
            }

            rev = rev * 10 + lastdigit;
        }

        return rev;
    }

    public static void main(String[] args) {
        int n = 203847858;
        System.out.println(reverse(n));
    }
}

/*
1. Initialize rev = 0.
2. Extract the last digit using x % 10.
3. Remove the last digit using x / 10.
4. Check if rev * 10 + digit would cause overflow/underflow.
5. Append the digit:
      rev = rev * 10 + digit
6. Repeat until x becomes 0.
7. Return rev.

Time Complexity: O(log₁₀N) (one iteration per digit)
Space Complexity: O(1)
*/
