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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode>pq=new PriorityQueue<>((a,b)->a.val-b.val);
        for(ListNode node:lists){
            if(node!=null){
                pq.add(node);
            }
        }
        ListNode dummey=new ListNode(0);
        ListNode tail=dummey;
        while(!pq.isEmpty()){
            ListNode minNode=pq.poll();
            tail.next=minNode;
            tail=tail.next;
            if(minNode.next!=null){
                pq.add(minNode.next);
            }

        }
        return dummey.next;

        
    }
}