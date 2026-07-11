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
    public ListNode swapNodes(ListNode head, int k) {
        
         ListNode slow=head;
         ListNode fast=head;
         for(int i=0;i<k;i++){
            fast=fast.next;
         }

         while(fast!=null){
            slow=slow.next;
            fast=fast.next;
         }
          
         ListNode temp=head;
         int m=1;
         while(m!=k){
            temp=temp.next;
            m++;
         }
         int temp2=temp.val;
         temp.val=slow.val;
         slow.val=temp2;
         return head;
    }
}