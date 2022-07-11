package 打家劫舍;

/**
 * @author YUChangcan
 * @date 2022/7/11 - 15:11
 */
class Solution {
    public int rob(int[] nums) {
        int len = nums.length;
        int[][]temp = new int[len][2];
        temp[0][0] = 0;
        temp[0][1] = nums[0];
        for(int i = 1;i < len;i++){
            temp[i][0] = Math.max(temp[i - 1][0],temp[i - 1][1]);
            temp[i][1] = temp[i - 1][0] + nums[i];
        }
        return temp[len - 1][0] > temp[len - 1][1] ? temp[len - 1][0] : temp[len - 1][1];

    }
}
