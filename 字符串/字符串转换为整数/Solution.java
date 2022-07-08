package 字符串转换为整数;


import java.util.StringTokenizer;

/**
 * @author YUChangcan
 * @date 2022/7/7 - 6:36
 */
class Solution {
    public int myAtoi(String s) {
        String tempS = s.trim();//第一步，去掉空格
        if(s.length() == 0)
            return 0;
        int index = 0;
        int sign = 1;
        int len = tempS.length();
        int tempDigit = 0;
        int result = 0;
        if(tempS.charAt(index) == '+' || tempS.charAt(index) == '-'){
            sign = tempS.charAt(index++) == '-' ? -1 : 1;//第二步，判断符号，如果是正号则为1，若是负号则为-1
        }
        for(;index < len;index++){//第三步，把字符串中的数字取出来
            if(tempS.charAt(index) - '0' >= 0 && tempS.charAt(index) - '0' <= 9){
                tempDigit = tempS.charAt(index) - '0';
            }
            else //如果不是数字则直接退出
                break;
            if(result > Integer.MAX_VALUE/10 || result == Integer.MAX_VALUE/10 && tempDigit > Integer.MAX_VALUE%10) {
                int temp = sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                return temp;
            }
            result = result * 10 + tempDigit;
        }
        System.out.println(sign*result);
        return sign * result;
    }
}
//        String str = s.replaceAll("[^0-9-]","");
//        String regex = "[ .]";
//        StringTokenizer stringTokenizer = new StringTokenizer(tempS,regex);
//        String tempStr = stringTokenizer.nextToken();
//        try{
//            Double.parseDouble(tempStr);
//        }catch (Exception e){return 0;}
//        System.out.println(Integer.parseInt(tempStr));
//        try {
//            return Integer.parseInt(tempStr);
//        }catch (Exception e){return (int)-2e32;}


