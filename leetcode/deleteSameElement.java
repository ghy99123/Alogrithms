/*  给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
 *  输入: 1->1->2
 *  输出: 1->2
 */


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
      ListNode current=head;
      while(current!=null&&current.next!=null){
        if(current.next.val==current.val){
        current.next=current.next.next;
        }
          
        else{
        current=current.next;
        }
          
      }
      return head;
     

    }
}
