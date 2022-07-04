package 两个数组的交集;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author YUChangcan
 * @date 2022/7/4 - 9:37
 */
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer>hashMap = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int i : nums1){
            hashMap.put(i,hashMap.getOrDefault(i,0) + 1);
        }
        for(int i : nums2){
            if(hashMap.getOrDefault(i,0) > 0){
                list.add(i);
                hashMap.put(i,hashMap.getOrDefault(i,0) - 1);
            }
        }
        int k = list.size();
        int result[] = new int[k];
        for(int i = 0;i < k;i++){
            result[i] = list.get(i);
        }
        return result;
    }
}
