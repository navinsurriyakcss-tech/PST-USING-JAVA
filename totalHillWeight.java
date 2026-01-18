import java.util.Scanner;
class UserMainCode {
    public int totalHillWeight(int input1, int input2, int input3) {
        // Read only region end
        
        int totalWeight = 0;
        int currentWeightPerStar = input2; // The weight of the head level

        // Iterate through each level from 1 up to input1
        for (int i = 1; i <= input1; i++) {
            // Each level 'i' contains 'i' stars
            // Add (number of stars * weight of stars in that row) to total
            totalWeight += (i * currentWeightPerStar);
            
            // The weight increments by input3 for each subsequent level
            currentWeightPerStar += input3;
        }

        return totalWeight;
    }
}
