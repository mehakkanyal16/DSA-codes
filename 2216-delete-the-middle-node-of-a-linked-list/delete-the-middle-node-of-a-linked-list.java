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
        int count=0;
        ListNode temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    public ListNode deleteMiddle(ListNode head) {
        if(head==null||head.next==null)return null;
        int count=length(head);
        int steps=count/2-1;
        ListNode temp=head;
        for(int i=1;i<=steps;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return head;

        
    }
}