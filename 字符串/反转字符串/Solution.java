package 反转字符串;

/**
 * @author YUChangcan
 * @date 2022/7/6 - 8:01
 */
class Solution {
    public void reverseString(char[] s) {
        int len = s.length;
        char tempChar;
        for(int i = 0;i < len/2;i++){
            tempChar = s[i];
            s[i] = s[len - 1 - i];
            s[len - 1 - i] = tempChar;
        }
    }
}
