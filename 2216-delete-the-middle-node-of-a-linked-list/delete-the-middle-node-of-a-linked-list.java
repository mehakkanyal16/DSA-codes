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
    int cnt = 0;
    while(head != null){
        cnt++;
        head = head.next;
    }
    return cnt;
}
    public ListNode deleteMiddle(ListNode head) {
        if(head==null||head.next==null)return null;
        int cnt=count(head);
        int idx=cnt/2;
        ListNode temp=head;
        for(int i=0;i<idx-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return head;

        
    }
}