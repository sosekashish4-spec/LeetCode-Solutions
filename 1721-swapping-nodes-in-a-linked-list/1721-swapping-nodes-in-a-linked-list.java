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
         ListNode temp=head;
         int len=0;
         while(temp!=null){
            temp=temp.next;
            len++;
         }
         temp=head;
         ListNode temp1=head;
         int j=1;
         while(j!=len-k+1){
            temp1=temp1.next;
            j++;
         }
         int m=1;
         while(m!=k){
            temp=temp.next;
            m++;
         }
         int temp2=temp.val;
         temp.val=temp1.val;
         temp1.val=temp2;
         return head;
    }
}