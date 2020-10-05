
///判断是否为回文链表，如[1,2,2,1]是回文链表

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

class Solution {
    public boolean isPalindrome(ListNode head) {
      
      ListNode midNode=getMidNode(head);
      ListNode latter=reverse(midNode);
      
      while(head!=null&&latter!=null){
        if(head.val!=latter.val){
          return false;
        }else{
          head=head.next;
          latter=latter.next;
        }
      }
      return true;
    }
    
    private ListNode getMidNode(ListNode head){
      ListNode fast=head,slow=head;
      while(fast!=null&&fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
      }
      return slow;
    }
                    
    private ListNode reverse(ListNode head){
      ListNode pre=null,next=null;
      while(head!=null){
        next=head.next;
        head.next=pre;
        pre=head;
        head=next;
      }
      return pre;
    }
}
