import java.util.Arrays;

public class Solution {

    static int[] nums = {3,2,4};
    static int target = 6;

    public static void main(String[] args) {
        twoSum(nums, target);
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target&&i!=j) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }
}
