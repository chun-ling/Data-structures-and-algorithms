package 向右翻转;

/**
 * @author YUChangcan
 * @date 2022/7/3 - 15:33
 */

class Solution {
    public void rotate(int[] nums, int k) {
        int temp[] = new int[nums.length];
        int len = nums.length;

        for(int i = 0;i < len;i++){
            temp[i] = nums[i];
        }
        int m = k % len;


        for(int i = 0;i < m;i++) {
            temp[i] = nums[len - m + i];
        }
        for (int i = m; i < len; i++) {
            temp[i] = nums[i - m];
        }
        for(int i = 0;i < nums.length;i++){
            nums[i] = temp[i];
        }

        for(int i = 0;i < len;i++){
            System.out.print(nums[i]);
        }

    }
}