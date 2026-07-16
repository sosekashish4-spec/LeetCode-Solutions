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
    public ListNode oddEvenList(ListNode head) {
        ListNode odd=new ListNode(-1);
        ListNode even=new ListNode(-1);

        ListNode head1=odd;
        ListNode head2=even;
        ListNode temp=head;

        while(temp!=null && temp.next!=null){
                head1.next=temp;
                temp=temp.next;
                head1=head1.next;
            
                head2.next=temp;
                temp=temp.next;     
                head2=head2.next;
        }
        if(temp!=null) {
            head1.next=temp;
            temp=temp.next;
            head1=head1.next;
        }
        head1.next=even.next;
        head2.next=null;
        return odd.next;
    }
}