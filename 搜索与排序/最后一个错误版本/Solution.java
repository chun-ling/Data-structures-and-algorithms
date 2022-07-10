package 最后一个错误版本;

/**
 * @author YUChangcan
 * @date 2022/7/10 - 17:14
 */
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int start = 1;
        int end = n;

        while(start < end){
            int mid = start + (end - start)/2;
            if(isBadVersion(mid)){
                end = mid;//当mid是错误版本时，他也可能是第一个错误版本，因此不能mid - 1
            }
            else
                start = mid + 1;
        }
        return start;

    }
}
