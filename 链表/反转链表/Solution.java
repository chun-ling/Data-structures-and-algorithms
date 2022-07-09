package 反转链表;

import java.util.Stack;

/**
 * @author YUChangcan
 * @date 2022/7/9 - 8:36
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        Stack<ListNode>stack = new Stack<>();
        while(head != null){
            stack.push(head);
            head = head.next;
        }
        if(stack.isEmpty())
            return null;
        ListNode node = stack.pop();
        ListNode resNode = node;
        while(!stack.isEmpty()){
            ListNode tempNode = stack.pop();
            node.next = tempNode;
            node = node.next;
        }
        node.next = null;
        return resNode;
    }
}
