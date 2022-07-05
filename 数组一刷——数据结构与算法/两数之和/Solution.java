package 两数之和;

/**
 * @author YUChangcan
 * @date 2022/7/5 - 8:36
 */
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        int temp[] = new int[2];
        l :for(int i = 0;i < len - 1;i++){
            for(int j = i+ 1;j < len;j++){
                if(nums[i] + nums[j] == target){
                    temp[0] = i;
                    temp[1] = j;
                    break l;
                }else
                    continue ;
            }
        }
        return temp;
    }
}
