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
    public ListNode mergeNodes(ListNode head) {
        ListNode temp=head.next;
        ListNode d=new ListNode(-1);
        ListNode t=d;
        int sum=0;
        while(temp!=null){
            if(temp.val!=0){
                sum+=temp.val;
            }else{
                ListNode a=new ListNode(sum);
                sum=0;
                t.next=a;
                t=t.next;
            }
            temp=temp.next;
        }
        return d.next;
    }
}