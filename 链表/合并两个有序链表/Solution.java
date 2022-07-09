package 合并两个有序链表;

/**
 * @author YUChangcan
 * @date 2022/7/9 - 10:29
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode node = new ListNode();
        ListNode resNode = node;//最后需要返回头节点，所以先定义一个指向头结点的结果结点
        while(list1 != null && list2 != null){
            if(list1.val >= list2.val) {
                node.next = list2;//头结点不能动，使用头结点的next
                list2 = list2.next;
            }
            else {
                node.next = list1;
                list1 = list1.next;
            }
            node = node.next;
        }
        if(list1 == null)
            node.next = list2;
        else
            node.next = list1;
        return resNode.next;//从next开始，所以返回node.next
    }
}
