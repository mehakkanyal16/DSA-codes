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
        ListNode temp=head;
        int cnt=0;
        while(temp!=null){
            cnt++;
            temp=temp.next;
        }
        return cnt;
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null){
            return null;
        }
          int n=count(head);
        ListNode temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=head;

      
        k=k%n;
        int skip=n-k;
        temp=head;
        for(int i=0;i<skip-1;i++){
            temp=temp.next;
        }

         ListNode newHead=temp.next;
         temp.next=null;
         return newHead;

        
    }
}