import java.util.*;

public class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        // Step 1: Find the maximum number of candies any kid has
        int maxCandies = Arrays.stream(candies).max().getAsInt();
        
        // Step 2: Create a result list to store the boolean values
        List<Boolean> result = new ArrayList<>();
        
        // Step 3: Check for each kid if their candies + extraCandies are enough to be the greatest
        for (int candy : candies) {
            result.add(candy + extraCandies >= maxCandies);
        }
        
        // Step 4: Return the result list
        return result;
    }
    
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test case 1
        int[] candies1 = {2, 3, 5, 1, 3};
        int extraCandies1 = 3;
        System.out.println(solution.kidsWithCandies(candies1, extraCandies1)); // Output: [true, true, true, false, true]

        // Test case 2
        int[] candies2 = {4, 2, 1, 1, 2};
        int extraCandies2 = 1;
        System.out.println(solution.kidsWithCandies(candies2, extraCandies2)); // Output: [true, false, false, false, false]
        
        // Test case 3
        int[] candies3 = {12, 1, 12};
        int extraCandies3 = 10;
        System.out.println(solution.kidsWithCandies(candies3, extraCandies3)); // Output: [true, false, true]
    }
}
