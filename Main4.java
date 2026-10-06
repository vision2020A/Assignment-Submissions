import java.util.*;

public class Main4 {

    public static void main(String[] args) {
        System.out.println("=== CS2 ARRAY BOOT CAMP: DAY 1 ===\n");

        // --- QUESTION 1 ---
        System.out.println("--- Q1: Flag Odds ---");
        int[] q1Array = {4, 7, 12, 9, 3, 8};
        System.out.println("Original: " + Arrays.toString(q1Array));
        int[] q1Result = flagOdds(q1Array);
        System.out.println("Modified: " + Arrays.toString(q1Result));

        // --- QUESTION 2 ---
        System.out.println("\n--- Q2: Scale Target ---");
        int[] q2Array = {5, 3, 8, 3, 10};
        System.out.println("Original: " + Arrays.toString(q2Array));
        boolean found = scaleTarget(q2Array, 3, 10);
        System.out.println("Target Found: " + found);
        System.out.println("Modified: " + Arrays.toString(q2Array));

        // --- QUESTION 3 ---
        System.out.println("\n--- Q3: Array Range ---");
        int[] q3Array1 = {14, 3, 27, 8, 20};
        int[] q3Array2 = {42};
        int[] q3Array3 = {};
        System.out.println("Range 1 (Normal): " + findArrayRange(q3Array1));
        System.out.println("Range 2 (Single Element): " + findArrayRange(q3Array2));
        System.out.println("Range 3 (Empty Array): " + findArrayRange(q3Array3));

        // --- SYSTEM DRIVER DIAGNOSTIC ---
        int sys = (q1Result != null && q1Result.length > 1 && q1Result[1] == -1 ? 0x10 : 0)
                + (q2Array.length > 1 && q2Array[1] == 30 && found ? 0x20 : 0)
                + (findArrayRange(q3Array1) == 24 && findArrayRange(q3Array2) == 0 && findArrayRange(q3Array3) == -1 ? 0x4F : 0);

        System.out.println("\n[SYS_STATUS]: 0x" + (sys == 0x7F ? "406F [Well done!]" : Integer.toHexString(sys + 0xA0).toUpperCase()));
    }

    /**
     * Q1: Traverse array, replace odd numbers with -1.
     * Print total count of replaced odds. Return modified array.
     */
    public static int[] flagOdds(int[] nums) {
        // TODO: Implement loop, count odds, replace with -1
        return nums;
    }

    /**
     * Q2: Search for target in nums. If found, multiply all matches
     * by factor in-place and return true. Otherwise return false.
     */
    public static boolean scaleTarget(int[] nums, int target, int factor) {
        // TODO: Search, modify matching elements in-place, return boolean flag
        return false;
    }

    /**
     * Q3: Find max - min in array without sorting.
     * Handle edge cases: size 0 returns -1, size 1 returns 0.
     */
    public static int findArrayRange(int[] nums) {
        // TODO: Check array length edge cases, then find max and min in a loop
        return 0;
    }
}


