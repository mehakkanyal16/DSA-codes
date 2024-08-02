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
    public boolean isPalindrome(ListNode head) {
        // ListNode curr=head;
        // List<Integer>list=new ArrayList();
        // while(curr!=null){
        //     list.add(curr.val);
        //     curr=curr.next;
        // }
        // int left=0;
        // int right=list.size()-1;
        // while(left<right&&list.get(left)==list.get(right)){
        //     left++;
        //     right--;
        // }
        // return left>=right;
        
        // time and space complexity of the above code is O(n).. so thats  why we can still optimise it more:


     ListNode mid=Mid(head);
     ListNode headSecond=reverse(mid);
     ListNode RereverseHead=headSecond;


     while(head!=null&&headSecond!=null){
        if(head.val!=headSecond.val){
            break;
        }
        head=head.next;
        headSecond=headSecond.next;
     }
     reverse(RereverseHead);
     if(head==null||headSecond==null){
        return true;
     }
     return false;




    }


    public ListNode Mid(ListNode head){
        ListNode s=head;
        ListNode f=head;
        while(f!=null&&f.next!=null){
            s=s.next;
            f=f.next.next;
        }
        return s;
    }
    public ListNode reverse(ListNode head){
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