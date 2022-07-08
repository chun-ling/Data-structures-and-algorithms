package 删除链表中的倒数第N个结点;

/**
 * @author YUChangcan
 * @date 2022/7/8 - 15:51
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head;
        ListNode slow = head;
        for(int i = 0;i < n;i++){
            fast = fast.next;//移动指针
        }
        if(fast == null)//若fast指向null，则表示删除头节点
            return head.next;
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;//删除指针，与移动指针不同的是改变了指针对象的成员变量
        return head;
    }
}
