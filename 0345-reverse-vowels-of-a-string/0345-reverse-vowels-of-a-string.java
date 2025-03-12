import java.util.*;

public class Solution {
    public static String reverseVowels(String s) {
        // Convert the string to a character array for easier manipulation
        char[] arr = s.toCharArray();
        // Define a set of vowels (both lowercase and uppercase)
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');
        
        // Initialize two pointers
        int left = 0, right = arr.length - 1;
        
        // Iterate through the string using the two pointers
        while (left < right) {
            // Move the left pointer to the next vowel
            while (left < right && !vowels.contains(arr[left])) {
                left++;
            }
            // Move the right pointer to the previous vowel
            while (left < right && !vowels.contains(arr[right])) {
                right--;
            }
            
            // If both pointers are at vowels, swap them
            if (left < right) {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                
                // Move the pointers inward
                left++;
                right--;
            }
        }
        
        // Convert the character array back to a string and return
        return new String(arr);
    }

    public static void main(String[] args) {
        // Test the method with example inputs
        String s1 = "IceCreAm";
        System.out.println(reverseVowels(s1)); // Output: "AceCreIm"
        
        String s2 = "leetcode";
        System.out.println(reverseVowels(s2)); // Output: "leotcede"
    }
}
