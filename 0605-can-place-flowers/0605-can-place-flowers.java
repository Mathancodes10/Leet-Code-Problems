public class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            // Check if the current plot is empty (0)
            // And also check if the adjacent plots are empty or out of bounds
            if (flowerbed[i] == 0 && 
                (i == 0 || flowerbed[i - 1] == 0) && 
                (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
                
                // Plant a flower here
                flowerbed[i] = 1;
                count++;
                
                // If we have already planted 'n' flowers, return true
                if (count >= n) {
                    return true;
                }
            }
        }
        
        // Return true if we planted 'n' or more flowers, else false
        return count >= n;
    }
}
