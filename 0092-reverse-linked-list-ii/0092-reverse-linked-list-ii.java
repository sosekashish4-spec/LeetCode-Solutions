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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head.next==null) return head;
        ListNode l=head;
        ListNode r=head;
        for(int i=1;i<left-1;i++){
            l=l.next;
        }
        ListNode m=l;
        if(left!=1) l=l.next;
        for(int j=1;j<right;j++){
            r=r.next;
        }
        ListNode n=r.next;
        r.next=null;

        //reverse
        ListNode p=null;
        ListNode c=l;
        ListNode f;
        while(c!=null){
            f=c.next;
            c.next=p;
            p=c;
            c=f;
        }
        if(left==1 && r!=n){
            l.next=n;
            return r;
        }else if(left==1 && r==n) return r;
        //connections
        m.next=r;
        l.next=n;
        return head;
    }
}