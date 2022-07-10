package 合并两个有序数组;

/**
 * @author YUChangcan
 * @date 2022/7/10 - 17:01
 */
public class E {
    public static void main(String[] args) {
        交换法 e = new 交换法();
        int[]nums1 = {1,2,3,0,0,0};
        int[]nums2 = {2,5,6};
        int m = 3;
        int n = 3;
        e.exchange(nums1,m,nums2,n);
    }
}
