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
    public ListNode sortList(ListNode head) {
        if(head==null) return null;
        if(head.next==null) return head;
        ListNode slow=head;
        ListNode fast=head;

        while(fast.next!=null && fast.next.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
        }
    
        ListNode head2=slow.next;
        slow.next=null;
        head=sortList(head);
        head2=sortList(head2);
        return mergeTwoList(head,head2);
    }

    public ListNode mergeTwoList(ListNode list1,ListNode list2){
        ListNode d=new ListNode(-1);
        ListNode t=d;

        while(list1!=null && list2!=null){
            if(list1.val<list2.val){
                t.next=list1;
                t=t.next;
                list1=list1.next;
            }else{
                t.next=list2;
                t=t.next;
                list2=list2.next;
            }
        }
        if(list1!=null) t.next=list1;
        if(list2!=null) t.next=list2;
        return d.next;
    }
}