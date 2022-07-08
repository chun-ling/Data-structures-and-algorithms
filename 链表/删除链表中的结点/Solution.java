
package 删除链表中的结点;

/**
 * @author YUChangcan
 * @date 2022/7/8 - 15:19
 */

class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;

    }
}
