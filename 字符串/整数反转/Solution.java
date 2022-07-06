package 整数反转;

/**
 * @author YUChangcan
 * @date 2022/7/6 - 8:18
 */
class Solution {
    public int reverse(int x) {
        int tempX = Math.abs(x);
        int res;
        String str;
        str = tempX + "";
        char tempChar;
        int len = str.length();
        char[]c = str.toCharArray();
        for(int i = 0;i < len/2;i++){
            tempChar = c[i];
            c[i] = c[len - 1 - i];
            c[len - 1 - i] = tempChar;
        }
        String tempString = new String(c);
        try {
            res = Integer.parseInt(tempString);
        }catch (Exception e){return 0;}
        if(x >= 0) return res;
        else return -res;

    }
}
