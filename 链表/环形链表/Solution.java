package 环形链表;

import java.util.HashSet;

/**
 * @author YUChangcan
 * @date 2022/7/9 - 14:53
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode>hashSet = new HashSet<>();
        while(head != null){
            hashSet.add(head);
            head = head.next;
            if(hashSet.contains(head))
                return true;
        }
        return false;

    }
}
