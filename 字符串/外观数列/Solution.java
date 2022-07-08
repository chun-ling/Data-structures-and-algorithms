package 外观数列;

/**
 * @author YUChangcan
 * @date 2022/7/8 - 8:22
 */
class Solution {
    public String countAndSay(int n) {
        if(n == 1)
            return "1";
        String tempStr = countAndSay(n - 1);
        int count = 0;
        int k = 0;
        StringBuffer resStr = new StringBuffer();
        for(int i = 0;i < tempStr.length();i++){
            if(tempStr.charAt(i) == tempStr.charAt(k)){
                count++;
            }else{
                resStr.append(count);
                resStr.append(tempStr.charAt(k));
                count = 1;
                k = i;
            }
        }
        resStr.append(count);
        resStr.append(tempStr.charAt(k));
        System.out.println(resStr);
        return new String(resStr);

    }
}
