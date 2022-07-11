package 爬楼梯;

/**
 * @author YUChangcan
 * @date 2022/7/11 - 9:04
 */
public class Non_recursive {
    public int climbStairs(int n) {
        if(n <= 2)
            return n;
        int first = 1;
        int second = 2;
        int sum = 0;
        while(n-- > 2){
            sum = first + second;
            first = second;
            second = sum;
        }
        return sum;
    }

}
