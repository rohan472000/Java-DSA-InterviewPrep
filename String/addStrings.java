// Problem- Given two non-negative integers, num1 and num2 represented as string, return the sum of num1 and num2 as a string.
// Example 1:
// Input: num1 = "11", num2 = "123"
// Output: "134"

// Example 2:
// Input: num1 = "456", num2 = "77"
// Output: "533"
// Tag - Easy

class Solution {
    public String addStrings(String num1, String num2) {
        String big = num1.length() >= num2.length() ? num1 : num2;
        String small = num1.length() < num2.length() ? num1 : num2;
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        for (int i = 0; i < big.length(); i++) {
            int b = big.charAt(big.length() - i - 1) - '0';
            int s = i < small.length() ? (small.charAt(small.length() - i - 1) - '0') : 0;
            sum += b + s;
            sb.append(sum % 10);
            sum /= 10;
        }
        if (sum > 0) sb.append(sum);
        return sb.reverse().toString();
    }
}