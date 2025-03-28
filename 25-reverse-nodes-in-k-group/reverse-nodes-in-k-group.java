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
    public ListNode reverseKGroup(ListNode head, int k) {
        int cnt=0;
        ListNode temp=head;
        while(cnt<k){
            if(temp==null){
                return head;
            }
            temp=temp.next;
            cnt++;
        }
        ListNode prevNode=reverseKGroup(temp,k);
        temp=head;
        cnt=0;
        while(cnt<k){
            ListNode next=temp.next;
            temp.next=prevNode;
            prevNode=temp;
            temp=next;
           cnt++;
        }
        return prevNode;
        
    }
}