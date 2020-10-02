/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
 
 ///快慢双指针 有环的话则快慢指针会相遇
public class Solution {
    public boolean hasCycle(ListNode head) {
      if(head==null)
        return false;
      ListNode slow=head,fast=head.next;
      while(fast!=null&&fast.next!=null){
        if(slow==fast)
          return true;
        slow=slow.next;
        fast=fast.next.next;
      }
      return false;
    }
}
