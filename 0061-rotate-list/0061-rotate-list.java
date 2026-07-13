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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode temp=head;
        int count=0;
        while(temp!=null){ 
             temp=temp.next;
             count++;
        }
        if(count==0|| count==1) return head;
        k%=count;
        if(k==0) return head;
        ListNode s=head;
        ListNode f=head;
        for(int i=0;i<k+1;i++)  f=f.next;

        while(f!=null){
            s=s.next;
            f=f.next;
        }
        ListNode a=s.next;
        s.next=null;

        ListNode t=a;
        while(t.next!=null) t=t.next;
        t.next=head;

        return a;
    }
}