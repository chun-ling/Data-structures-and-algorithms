package 最小栈;

import java.util.ArrayList;
import java.util.List;

/**
 * @author YUChangcan
 * @date 2022/7/11 - 16:56
 */
class MinStack {
    public class ListNode{
        int val;
        int min;
        ListNode next;
        ListNode(int x,int min,ListNode head){
            this.val = x;
            this.min = min;
            next = head;
        }
    }
    ListNode head;

    public MinStack() {
    }

    public void push(int val) {
        if(head == null)
            head = new ListNode(val,val,head);
        else
            head = new ListNode(val,Math.min(val,head.min),head);

    }

    public void pop() {
        head = head.next;

    }

    public int top() {
        return head.val;

    }

    public int getMin() {
        return head.min;

    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */