package 输出数组中唯一出现的数;

/**
 * @author YUChangcan
 * @date 2022/7/4 - 8:33
 */
public class Solution {
    public int singleNumber(int[] nums) {
        int i = 0;
        int j;
        for (i = 0; i < nums.length - 1; i++) {
            for (j = 0; j < nums.length && i != j; j++) {
                if (nums[i] == nums[j])
                    break;
                else if (j == nums.length - 1)
                    return nums[i];
                else
                    continue;
            }
        }
        return 0;
    }

}
