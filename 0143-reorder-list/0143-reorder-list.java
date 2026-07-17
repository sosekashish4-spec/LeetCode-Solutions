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
    public void reorderList(ListNode head) {
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
        ListNode m=head;
        ListNode n=p;
        ListNode s=m.next;
        ListNode t=n.next;
        while(t!=null){
            m.next=n;
            m=s;
            s=s.next;
            n.next=m;
            n=t;
            t=t.next;
        }
    }
}