package 有效的字母异位词;

import java.awt.*;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/**
 * @author YUChangcan
 * @date 2022/7/6 - 10:22
 */
class Solution {
    public boolean isAnagram(String s, String t) {
        char tempS[] = s.toCharArray();
        char tempT[] = t.toCharArray();
        int lenOne = s.length();
        int lenTwo = t.length();
        HashMap<Character,Integer>hashMapOne = new HashMap<>();
        for(int i = 0;i < lenOne;i++){
            hashMapOne.put(tempS[i],hashMapOne.getOrDefault(tempS[i],0) + 1);
        }
        for(int i = 0;i < lenTwo;i++){
            hashMapOne.put(tempT[i],hashMapOne.getOrDefault(tempT[i],0) - 1);
        }
        int k = 0;
        int len = hashMapOne.values().size();
        for(int i : hashMapOne.values()) {
            k++;
            if (i != 0)
                return false;
//            if(k == len)//第一次进入循环时k为1，则最后一次进入循环时，k为len
        }
        return true;
    }
}
