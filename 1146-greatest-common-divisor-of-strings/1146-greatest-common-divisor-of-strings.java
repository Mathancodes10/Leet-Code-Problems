public class Solution {

    public static String gcdOfStrings(String str1, String str2) {
        // Step 1: Check if str1 + str2 is equal to str2 + str1
        // This ensures both strings can be formed from the same repeating pattern
        if (!(str1 + str2).equals(str2 + str1)) {
         return ""; // No common divisor string
        }

        // Step 2: Find the GCD of the lengths of the two strings
        int gcdLength = gcd(str1.length(), str2.length());

        // Step 3: The answer is the substring of str1 of length gcdLength
        return str1.substring(0, gcdLength); // Return the substring as the divisor string
    }

    // Helper function to compute the GCD of two numbers
    private static int gcd(int a, int b) {
        // Implementing the Euclidean algorithm
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        // Test Cases
        System.out.println(gcdOfStrings("ABCABC", "ABC")); // Output: "ABC"
        System.out.println(gcdOfStrings("ABABAB", "ABAB")); // Output: "AB"
        System.out.println(gcdOfStrings("LEET", "CODE"));   // Output: ""
        // Additional Test Cases
        System.out.println(gcdOfStrings("ABC", "ABCABC"));  // Output: "ABC"
        System.out.println(gcdOfStrings("AA", "A"));        // Output: "A"
    }
}
