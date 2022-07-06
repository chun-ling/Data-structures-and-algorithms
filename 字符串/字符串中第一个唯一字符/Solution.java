package 字符串中第一个唯一字符;

/**
 * @author YUChangcan
 * @date 2022/7/6 - 8:48
 */
class Solution {
    public int firstUniqChar(String s) {
        char[]tempChar = s.toCharArray();
        int len = tempChar.length;
        int i = 0;
        int j = 0;
        if(len == 1)
            return 0;
        else {
           l: for (i = 0; i < len ; i++) {
                for (j = 0; j < len; j++) {
                    if (j == i )
                        continue;
                    if (tempChar[i] == tempChar[j])
                        break ;
                    if (j == len - 1)
                        return i;
                }
            }
            if(i == len && j == len)
                return i;
            return -1;
        }
    }
}
