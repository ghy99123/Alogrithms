///反转链表

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
      ListNode pre=null;
      ListNode next=null;
      
      ///1.头节点的下一个结点设为next（保存头节点的下一个节点）
      ///2.当前头节点的下一个节点指向'上一个节点'（反转）
      ///3.更新'上一个节点'
      ///4.next设置为新的头节点
      while(head!=null){
        next=head.next;
        head.next=pre;
        pre=head;
        head=next;
      }
      return pre;
    }
}
