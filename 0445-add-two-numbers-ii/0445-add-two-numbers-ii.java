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
     public ListNode reverse(ListNode t){
        ListNode p=null;
        ListNode c=t;
        ListNode f;

        while(c!=null){
            f=c.next;
            c.next=p;
            p=c;
            c=f;
        }
        return p;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode d=new ListNode(-1);
        ListNode m=d;
        ListNode h1=reverse(l1);
        ListNode h2=reverse(l2);
        ListNode t1=h1;
        ListNode t2=h2;
        ListNode temp;
        int carry=0;
        while(t1!=null && t2!=null){
            int sum=t1.val+t2.val+carry;
            temp=new ListNode(sum%10);
            if(sum<=9) carry=0;
            else carry=1;
            m.next=temp;
            m=m.next;
            t1=t1.next;
            t2=t2.next;
        }
        while(t1!=null){
            int sum=t1.val+carry;
            temp=new ListNode(sum%10);
            if(sum<=9)carry=0;
            else carry=1;
            m.next=temp;
            m=m.next;
            t1=t1.next;
        }
        while(t2!=null){
            int sum=t2.val+carry;
            temp=new ListNode(sum%10);
            if(sum<=9)carry=0;
            else carry=1;
            m.next=temp;
            m=m.next; 
            t2=t2.next;
        }
        if(carry==1){
            temp=new ListNode(1);
            m.next=temp;
            m=m.next;
        }
        ListNode ans=reverse(d.next);
        return ans;
    }
}