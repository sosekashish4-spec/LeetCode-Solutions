/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        if(head==null) return head;
       Node temp=head; 
       while(temp!=null){
        if(temp.child==null) temp=temp.next;
        else{
            Node a=temp.next;
            Node c=flatten(temp.child);
            temp.child=null;
            temp.next=c;
            c.prev=temp;
            Node ptr=c;
            while(ptr.next!=null)  ptr=ptr.next;
            ptr.next=a;
            if(a!=null) a.prev=ptr;
            temp=a;
             } 
       }
       return head;
    }
}