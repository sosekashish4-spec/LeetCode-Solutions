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
    public int gcd(int t1,int t2){
         if(t1==0) return t2;
        return gcd(t2%t1,t1);
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode temp=head;
        while(temp.next!=null){
            int a=gcd(temp.val,temp.next.val);
            ListNode ptr=new ListNode(a);
            ListNode b=temp.next;
            temp.next=ptr;
            ptr.next=b;
            temp=b;
        }
        return head;
    }
}