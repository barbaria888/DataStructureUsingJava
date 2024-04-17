class Doublylinked{
    node head;
    node tail;
    int size;
    static class node{
        node prev;
        int data;
        node next;
        node(int data)
        {
            this.data =data;
            this.prev =null;
            this.next=null;
        }
        node(node prev, int data,node next)
        {
            this.data =data;
            this.prev = prev;
            this.next=next;
        }
        node( int data,node next)
        {
            this.data =data;
            this.prev = null;
            this.next=next;
        }
        node(node prev, int data)
        {
            this.data =data;
            this.prev = prev;
            this.next = null;
        }
    }/*
    public void deleteTail(){
       node temp = head;
        while(temp!=null) {
         temp=temp.next;
        }
        tail = temp;
        tail = tail.prev;
        tail.next =null;
    }*/
    public void traverseBack(){
        node temp = tail;
        while(temp!=null){
            System.out.print(temp.data+" ");
                temp = temp.prev;
        }
        System.out.print("<-head");
    }
    public node addAtHead(int data)
    {
        node newnode = new node(data);
        node temp =head;
        System.out.println(":::");
        System.out.println(temp.data);
        temp.prev = newnode;
        newnode.next =temp;
        head =newnode;
        System.out.println(head.data);
        return head;
    }
    public  void add(int data){
        node newnode = new node(data);
        node temp =  head;
        node prev,next;
        while(temp!=null){
            prev  = temp.prev;
            next = temp.next;
            temp = temp.next;
        }
        return;
        //newnode
    }
    void Display() {
        node temp = head;

        while (temp != null)
        {
            System.out.print(temp.data + "->");
            temp=temp.next;
        }
        System.out.print("null");
    }
    public void AddCircular(int data){
        node newnode =new node(data);
        if(head == null){
            node temp =head;
        head =newnode;
        head.next  =head;
        }
    }
    public void traverseCircular()
    {
        node temp=head;
        do{
            System.out.print(temp.data+"->");
        }while(temp.next!=head);
    }
    public void AddCirculr(int data){
        node newnode =new node(data);
if(head ==null){

}
                head.next  =head;
    }

    public static void main(String[] args) {
        Doublylinked dl = new Doublylinked();
        dl.head =new node(0);
        dl.addAtHead(1);
        dl.addAtHead(2);
        dl.addAtHead(3);
        dl.addAtHead(4);
        dl.addAtHead(5);
        System.out.println(dl.head.prev.data);
        //dl.Display();
        dl.traverseBack();
        //System.out.println(dl.tail);
        Doublylinked p = new  Doublylinked();
        p.add(1);
        p.AddCircular(5);

                //dl.deleteTail();



    }
}
