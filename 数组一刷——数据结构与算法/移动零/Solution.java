package 移动零;

import java.util.ArrayList;
import java.util.List;

/**
 * @author YUChangcan
 * @date 2022/7/5 - 8:24
 */
class Solution {
    public void moveZeroes(int[] nums) {
        int len = nums.length;
        int k = 0;
        List<Integer> list = new ArrayList<>();
        for(int i = 0;i < len;i++){
            if(nums[i] == 0){
                k++;
            }
            else{
                list.add(nums[i]);
            }
        }
        for(int i = 0;i < k;i++){
            list.add(0);
        }
        for(int i = 0;i < len;i++){
            nums[i] = list.get(i);
        }

    }
}

