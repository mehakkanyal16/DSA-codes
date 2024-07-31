/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
    //   if(head==null||head.next==null){
    //     return head;
    //   }
    //   ListNode newNode=reverseList(head.next);
    //   head.next.next=head;
    //   head.next=null;
    //   return newNode;
  

   if(head==null){
    return head;
   }

    ListNode prev=null;
    ListNode curr=head;
    ListNode next=curr.next;
    
    while(curr!=null){
        curr.next=prev;
        prev=curr;
        curr=next;
        if(next!=null){
          next=next.next;
        }
 

    }

        return prev;
        
    }
}