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
       //half reverse->compare->return
        ListNode slow=head;
        ListNode fast=head;
        fast=fast.next;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
       ListNode p=null;
       ListNode c=slow;
       ListNode f=slow;
       while(c!=null){
            f=f.next;
            c.next=p;
            p=c;
            c=f;
       }
       ListNode temp=head;
       ListNode tem=p;
       while(temp!=null) {
            if(temp.val!=p.val) return false;
            temp=temp.next;
            p=p.next;
       }
       return true;
    }
}