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
    public ListNode removeElements(ListNode head, int val) {
        ListNode t=head;
        ListNode ptr=new ListNode(-1);
        ListNode p=ptr;
        
        while(t!=null){
            if(t.val==val){     
                ptr.next=t;
            }else{
                ptr.next=t;      
                ptr=ptr.next;
            }
            t=t.next;
        }
        ptr.next=null;
        return p.next;
    }
}