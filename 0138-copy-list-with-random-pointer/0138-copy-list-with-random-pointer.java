/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node deep(Node temp){
        Node d=new Node(-1);
        Node t=d;
        while(temp!=null){
            Node a=new Node(temp.val);
            t.next=a;
            t=t.next;
            temp=temp.next;
        }
        t.next=null;
        return d.next;
    }
    public void weave(Node t1,Node t2){
        Node t=t1 ;
        Node p=t1;
        Node q=t2;
        while(t!=null){
            p=t1.next;
            t1.next=t2;
            t=t.next;
            q=t2.next;
            t1=p;
            t2.next=t1;
            t=t.next;
            t2=q;
           if(q!=null) q=q.next;
        }
    }
    public void randPoin(Node head1, Node head2) {
        Node temp1 = head1;
        Node temp2 = head2;
        while(temp1!=null && temp2!=null){
            if(temp1.random==null) temp2.random = null;
            else temp2.random = temp1.random.next; // main cheez
            temp1 = temp1.next.next;
            if(temp2.next!=null) temp2 = temp2.next.next;
        }
    }
    public void deweave(Node p1,Node p2){
        while(p1!=null && p2!=null && p1.next!=null && p2.next!=null){
            p1.next=p1.next.next;
            p1=p1.next;
            p2.next=p2.next.next;
            p2=p2.next;
        }
         p1.next=null;
    }
    public Node copyRandomList(Node head) {
        if(head==null) return head;
        Node ptr=deep(head);
        weave(head,ptr);
        randPoin(head,ptr);
        deweave(head,ptr);
        return ptr;
    }
}