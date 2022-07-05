package 尾数加一;

import java.util.ArrayList;
import java.util.List;

/**
 * @author YUChangcan
 * @date 2022/7/5 - 7:36
 */
public class Solution {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        for(int i = len - 1;i >= 0;i--){
            if(digits[i] != 9){
                digits[i] += 1;
                return digits;
            }
            else{
                digits[i] = 0;
            }
        }
        int temp[] = new int[len + 1];
        temp[0] = 1;
        for(int i = 1;i < len + 1;i++){
            temp[i] = 0;
        }
        return temp;
    }
}
