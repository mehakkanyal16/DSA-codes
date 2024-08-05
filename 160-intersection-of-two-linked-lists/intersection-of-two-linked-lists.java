/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
         if (headA == null || headB == null) {
            return null;
        }
        ListNode temp=headA;
        ListNode temp2=headB;
        while(temp!=temp2){
            temp = (temp == null) ? headB : temp.next;
            temp2 = (temp2 == null) ? headA : temp2.next;
        }
        return temp;
        
        
    }
}