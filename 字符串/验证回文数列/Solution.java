package 验证回文数列;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * @author YUChangcan
 * @date 2022/7/6 - 16:17
 */
class Solution {
    private char c;

    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        char tempChar[] = s.toCharArray();
        List<Character> list = new ArrayList<>();
        for(char c : tempChar){
            if(c >= '0' && c <= '9' || c >= 'a' && c <= 'z')
                list.add(c);
        }
        int len = list.size();
        for(int i = 0;i < len/2;i++){
            if(list.get(i) != list.get(len - 1 - i))
                return false;
        }
        return true;
    }
}
