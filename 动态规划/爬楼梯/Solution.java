package 爬楼梯;

/**
 * @author YUChangcan
 * @date 2022/7/11 - 8:18
 */
class Solution {
    public int climbStairs(int n) {
        if(n <= 1)
            return 1;
        if(n < 3)
            return 2;
        return climbStairs(n - 1) + climbStairs(n - 2);

    }
}
