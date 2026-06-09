import java.util.*;

public class RomanNumberToInteger {

    public static int getVal(char ch) {
        switch (ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }

    public static int romanToInt(String s) {
        int n = s.length();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            char ch1 = s.charAt(i);

            // Subtractive case
            if ((i + 1) < n && getVal(ch1) < getVal(s.charAt(i + 1))) {
                sum -= getVal(ch1);
            } else {
                sum += getVal(ch1);
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String roman = sc.nextLine();

        System.out.println(romanToInt(roman));

        sc.close();
    }
}

// Traverse the Roman numeral from left to right.
//
// If the current symbol has a smaller value than the next symbol,
// subtract its value from the answer.
//
// Otherwise, add its value.
//
// Example:
// IV -> 1 < 5, so subtract 1 and add 5 = 4
// IX -> 1 < 10, so subtract 1 and add 10 = 9
//
// Time Complexity: O(n)
// Space Complexity: O(1)