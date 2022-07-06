package 有效的字母异位词;

/**
 * @author YUChangcan
 * @date 2022/7/6 - 10:32
 */
public class E {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = new String("asdf");
        String t = new String("fdsa");
        System.out.println(solution.isAnagram(s,t));
    }
}
