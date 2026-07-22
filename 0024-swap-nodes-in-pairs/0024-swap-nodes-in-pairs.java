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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null) return head;
        // ListNode odd=new ListNode(-1);
        // ListNode even=new ListNode(-1);
        // ListNode temp=head;
        // ListNode i=odd;
        // ListNode j=even;

        // while(temp!=null && temp.next!=null){
        //     i.next=temp;
        //     temp=temp.next;
        //     i=i.next;

        //     j.next=temp;
        //     temp=temp.next;
        //     j=j.next;
        // }
        // if(temp!=null){
        //      i.next=temp;
        //     temp=temp.next;
        //     i=i.next;
        // }
        // i.next=null;
        // j.next=null;

        // ListNode m=odd;
        // ListNode n=odd.next;
        // ListNode p=even.next;
        // ListNode q=even.next.next;

        // while(  q!=null){
        //     m.next=p;
        //     m=n;
        //     n=n.next;
        //     p.next=m;
        //     p=q;
        //     q=q.next;
        // }

        // return odd.next;
        ListNode d=new ListNode(-1);
        ListNode p=head;
        ListNode c=p.next;
        ListNode f=c.next;
        d.next=c;

        while(f!=null && f.next!=null){
            c.next=p;
            p.next=f.next;
            p=f;
            c=p.next;
            f=c.next;
        }
        if(f==null){ 
        c.next=p;
        p.next=null;
        }else{
            c.next=p;
            p.next=f;
        }
        return d.next;
    }
}