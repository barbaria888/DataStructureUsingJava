import java.util.*;
class node {
    int data;
    node next;
    //constructor
    node(int value) {
        this.data = value;
        this.next = null;
    }

        public static void insertAtHead(node prev,int value) {
            //task1:new node create karna
            node newnode = new node(value);
            // task2: newnode ke next main head dalna
            newnode.next = prev;
            // task3: update head

        }
    public static void traverse(node head) {
        node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        node head = new node(12);
        //while (head != null)


        insertAtHead(head,11);

          insertAtHead(head,10);
          //head  = head.next;
        insertAtHead(head,9);
        //head = head.next;
        insertAtHead(head,8);
        //head = head.next;
        insertAtHead(head,7);


        traverse(head);
        //System.out.println(head.data);

}
}