public class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder mergedString = new StringBuilder();
        int i = 0, j = 0;

        // Alternate merging characters from both strings
        while (i < word1.length() && j < word2.length()) {
            mergedString.append(word1.charAt(i));
            mergedString.append(word2.charAt(j));
            i++;
            j++;
        }

        // Append the remaining characters from word1 if any
        while (i < word1.length()) {
            mergedString.append(word1.charAt(i));
            i++;
        }

        // Append the remaining characters from word2 if any
        while (j < word2.length()) {
            mergedString.append(word2.charAt(j));
            j++;
        }

        return mergedString.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test case 1
        String word1 = "abc", word2 = "pqr";
        System.out.println(solution.mergeAlternately(word1, word2)); // Output: "apbqcr"

        // Test case 2
        word1 = "ab";
        word2 = "pqrs";
        System.out.println(solution.mergeAlternately(word1, word2)); // Output: "apbqrs"

        // Test case 3
        word1 = "abcd";
         word2 = "pq";
        System.out.println(solution.mergeAlternately(word1, word2)); // Output: "apbqcd"
    }
}
