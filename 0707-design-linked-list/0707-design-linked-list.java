class MyLinkedList {
         ListNode head;
         ListNode tail;
         int size;
    public MyLinkedList() {
          head=null;
          tail=null;
          size=0;
    }
    
    public int get(int index) {
        ListNode temp=head;
        if(index<0 || index >= size) return -1;
        while(index!=0){
            temp=temp.next;
            index--;
        }
        return temp.val;
    }
    
    public void addAtHead(int val) {
        ListNode temp=new ListNode(val);
        if(head==null) head=tail=temp;
        else{ 
        temp.next=head;
        head=temp;
        }
        size++;
    }
    
    public void addAtTail(int val) {
        ListNode temp=new ListNode(val);
        if(head==null) head=tail=temp;
        else{ 
        tail.next=temp;
        tail=temp;
        }
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        if(index<0 || index>size) return;
        if(index==0) addAtHead(val);
        else if(index==size) addAtTail(val);
        else{ 
        ListNode temp=head;
        ListNode temp1=new ListNode(val);
        while(index!=1){
            temp=temp.next;
            index--;
        }
        temp1.next=temp.next ;
        temp.next=temp1;
        size++;
       }
    }
    public void deleteAtIndex(int index){
        if(index < 0 || index >= size) return;

        if(index == 0){
            head = head.next;
            if(head == null) tail = null;
            size--;
            return;
        } 
        ListNode temp = head;
        for(int i = 0; i < index-1; i++)
            temp = temp.next;
        temp.next = temp.next.next;
        if(temp.next == null) tail = temp;
        size--;
}  
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */