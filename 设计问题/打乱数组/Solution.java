package 打乱数组;

import java.util.Random;

/**
 * @author YUChangcan
 * @date 2022/7/11 - 16:55
 */
class Solution {
    int[] nums;

    public Solution(int[] nums) {
        this.nums = nums;

    }

    public int[] reset() {
        return nums;

    }

    public int[] shuffle() {
        Random random = new Random();
        int[] a = nums.clone();
        for(int i = 0;i < nums.length;i++){
            int j = random.nextInt(i + 1);
            if(i != j){
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }

        }
        return a;

    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */

