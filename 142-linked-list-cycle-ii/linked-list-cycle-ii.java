/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                break;
            }
        }

        if (fast == null || fast.next == null) return null;
        // After the loop, if fast has reached the end of the list (fast == null or fast.next == null), it means there's no cycle in the list.

        while(head!=slow){
            head=head.next;
            slow=slow.next;
        }
        return head;
        
    }
}