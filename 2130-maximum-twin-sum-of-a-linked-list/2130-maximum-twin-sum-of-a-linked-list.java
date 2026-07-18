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
    public int pairSum(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }

        ListNode p=null;
        ListNode c=slow;
        ListNode f;

        while(c!=null){
            f=c.next;
            c.next=p;
            p=c;
            c=f;
        }
 
        int max=Integer.MIN_VALUE;
        ListNode i=head;
        ListNode j=p;
        while(j!=null){
            int nsum=i.val+j.val;
            if(nsum>max) max=nsum;
            i=i.next;
            j=j.next;
        }
        return max;
    }
}