package com.miscellaneous.BinarySearch;

import java.util.Arrays;

public class CapacityToShipPackagesWithinDdays {
    public static int shipWithinDays(int[] weights, int days) {
        // Find the maximum weight (minimum possible capacity) and the sum of all weights (maximum possible capacity)
        int max = Arrays.stream(weights).max().getAsInt();
        int sum = Arrays.stream(weights).sum();

        int res = 0; // Initialize the result variable to store the minimum capacity needed

        // Binary search between max (min capacity needed) and sum (max capacity needed)
        while (max <= sum) {
            int mid = max + (sum - max) / 2; // Calculate the mid point

            if (capable(mid, days, weights)) {
                res = mid;    // If mid capacity works, store it as a possible result
                sum = mid - 1; // Try to find a smaller capacity by adjusting the upper bound
            } else {
                max = mid + 1; // If mid capacity doesn't work, increase the lower bound
            }
        }

        return res; // Return the minimum capacity needed
    }

    // Function to check if the given capacity can ship all packages within the given days
    public static boolean capable(int capacity, int days, int[] weights) {
        int currentCapacity = 0; // Current capacity for a single day
        int requiredDays = 1; // Start with one day

        for (int weight : weights) {
            // If adding the current weight exceeds the capacity, we need a new day
            if (currentCapacity + weight > capacity) {
                requiredDays++; // Increase the number of days required
                currentCapacity = 0; // Reset the current capacity for the new day
            }
            currentCapacity += weight; // Add the weight to the current day's capacity
        }

        // Return true if we can ship all packages within the given days, false otherwise
        return requiredDays <= days;
    }
}
