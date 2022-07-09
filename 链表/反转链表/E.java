package 反转链表;

import java.util.List;

/**
 * @author YUChangcan
 * @date 2022/7/9 - 10:10
 */
public class E {
    public static void main(String[] args) {
        ListNode head = new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5,null)))));
        Solution solution = new Solution();
        solution.reverseList(head);
        System.out.println(head);
    }
}
