public class Solution {
    public String reverseWords(String s) {
        // Trim leading and trailing spaces, then split by one or more spaces
        String[] words = s.trim().split("\\s+");
        
        // StringBuilder to construct the result
        StringBuilder reversedString = new StringBuilder();
        
        // Loop through the words in reverse order and append to the result
        for (int i = words.length - 1; i >= 0; i--) {
            reversedString.append(words[i]);
            // Append a space between words, but not at the end
            if (i > 0) {
                reversedString.append(" ");
            }
        }
        
        return reversedString.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();  // Create an instance of Solution class
        
        // Test cases
        System.out.println(solution.reverseWords("the sky is blue")); // Output: "blue is sky the"
        System.out.println(solution.reverseWords("  hello world  ")); // Output: "world hello"
        System.out.println(solution.reverseWords("a good   example")); // Output: "example good a"
    }
}
