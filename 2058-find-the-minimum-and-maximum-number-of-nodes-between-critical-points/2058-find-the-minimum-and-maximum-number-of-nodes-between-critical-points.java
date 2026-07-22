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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[]ans={-1,-1};
        if(head.next.next==null) return ans;
        ListNode p=head;
        ListNode c=head.next;
        ListNode f=c.next;
        int fInd=-1;
        int ind=0;
        int mdist=Integer.MAX_VALUE;
        int Dist=0;
        int count=0;
        while(f!=null){
            if(c.val>p.val && c.val>f.val || c.val<p.val && c.val<f.val){
                int Mdist=ind-Dist;  
                Dist=ind;
                if(fInd==-1) fInd=ind;
                if(mdist>Mdist||mdist==0) mdist=Mdist;
                count++;
            }
            f=f.next;
            c=c.next;
            p=p.next;
            ind++;
        }
        if(count==1) return ans;
        if(mdist==Integer.MAX_VALUE) mdist=-1;
        ans[0]=mdist;
        if(fInd==-1||Dist-fInd==0) ans[1]=-1;
        else ans[1]=Dist-fInd;
        if(count==2) ans[0]=ans[1];
        return ans;
    }
}