package 回文链表;

import java.util.Stack;

/**
 * @author YUChangcan
 * @date 2022/7/9 - 11:11
 */
class Solution {
    public boolean isPalindrome(ListNode head) {//链表只能单向遍历，而栈是先进后出的，两者正好互补
        Stack<Integer>stack = new Stack<>();
        ListNode tempNode = head;//把head的引用复印给tempNode，改变tempNode不会改变head
        while(tempNode != null){
            stack.push(tempNode.val);
            tempNode = tempNode.next;
        }
        while(!stack.isEmpty()){
            if(head.val != stack.pop())
                return false;
            head = head.next;
        }
        return true;
    }
}
