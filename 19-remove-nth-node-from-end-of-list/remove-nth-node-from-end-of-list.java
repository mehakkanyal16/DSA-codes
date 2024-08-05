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
    private int length(ListNode head){
        int count=0;
        while(head!=null){
            head=head.next;
            count++;
        }
        return count;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
       
        int k=length(head);
        int t=k-n;

        if (t == 0) {
            return head.next;
        }
        
        ListNode curr=head;
        for(int i=0;i<t-1;i++){
           curr=curr.next;
        }
        curr.next=curr.next.next;
        return head;
        
    }
}