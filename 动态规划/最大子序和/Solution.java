package 最大子序和;

/**
 * @author YUChangcan
 * @date 2022/7/11 - 10:59
 */
class Solution {
    public int maxSubArray(int[] nums) {
        int len = nums.length;
        int[]result = new int[len];
        result[0] = nums[0];
        int max = result[0];
        for(int i = 1;i < len;i++) {
            result[i] = Math.max(result[i - 1], 0) + nums[i];
            if (result[i] > max)
                max = result[i];
        }
        return max;
    }

}
