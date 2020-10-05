/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int getDecimalValue(ListNode head) {
      // ListNode newHead=reverse(head);
      // int count=0;
      int sum=0;
      
      //二进制转十进制公式
      while(head!=null){
       sum=sum*2+head.val;
       head=head.next;
      }
      return sum;
    }
                    
    // private ListNode reverse(ListNode head){
    //   ListNode pre=null,next=null;
    //   while(head!=null){
    //     next=head.next;
    //     head.next=pre;
    //     pre=head;
    //     head=next;
    //   }
    //   return pre;
    // }
}
