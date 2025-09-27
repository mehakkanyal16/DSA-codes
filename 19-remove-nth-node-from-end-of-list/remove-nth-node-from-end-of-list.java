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
    public int length(ListNode head){
        ListNode temp=head;
        int cnt=0;
        while(temp!=null){
            cnt++;
            temp=temp.next;
        }
        return cnt;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null)return head;
        int l=length(head);
        int steps=l-n;
        if(steps==0)return head.next;
        ListNode temp=head;
        for(int i=0;i<steps-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
      return head;

        
    }
}