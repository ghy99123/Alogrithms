/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
      
      ListNode prev=new ListNode(0);
      prev.next=head;
      ListNode current=prev;
      
      while(current.next!=null){
        if(current.next.val==val){
          current.next=current.next.next;
        }else{
          current=current.next;
        }
      }
      return prev.next;
    }
}
