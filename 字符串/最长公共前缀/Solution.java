package 最长公共前缀;

/**
 * @author YUChangcan
 * @date 2022/7/8 - 10:16
 */
class Solution {
    public String longestCommonPrefix(String[] strs) {
        String resStr = strs[0];
        for(int i = 1;i < strs.length;i++){
            while(strs[i].indexOf(resStr) != 0){
                resStr = resStr.substring(0,resStr.length() - 1);
            }
        }
        return resStr;
    }
}
//        StringBuffer tempStr = new StringBuffer();
//        for(int k = 0;k < Math.min(strs[0].length(),strs[1].length());k++) {
//            try {
//                for (int i = 0; i < strs.length - 1; i++) {
//
//                        if (strs[i].charAt(k) == strs[i + 1].charAt(k)) {
//                            continue;
//                        } else {
//                            return new String(tempStr);
//                        }
//
//                }
//                tempStr.append(strs[0].charAt(k));
//            }catch (Exception e){return "";}
//        }
//        return new String(tempStr);
//    }
//}
