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
    public int count(ListNode head){
        int cnt=0;
        ListNode temp=head;
        while(temp!=null){
            cnt++;
            temp=temp.next;
        }
        return cnt;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
    // Create a dummy node that points to the head
    ListNode dummy = new ListNode(0);
    dummy.next = head;
        int cnt=count(head);
        int k=cnt-n;
        ListNode temp=dummy;
        for(int i=0;i<k;i++){
            temp=temp.next;

        }
        temp.next=temp.next.next;
        return dummy.next;
        
    }
}