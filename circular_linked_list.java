    public class circular_linked_list
    {
        node head;
        node tail;
        int size;

        static class node{
            int data;
            node next;
            public node(int data){
                this.data=data;
                this.next=null;

            }
            public node(int data,node next){
                this.data=data;
                this.next=next;
            }

        }
        /*public void OFGivenSize(int len){

        }*/

        public void add(int data)
        {
            node temp =new node(data);
            if(head==null)
            {
                head = temp;
                tail=head;
            }
            tail.next = temp;
            tail  = temp;
            tail.next =head;
            size++;
        }
        public void Display(){
            node temp =head;
            while(temp.next!=head)
            {
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
            System.out.print("null");
        }
    public int RemoveFromTail()
    {
        node temp=head;
    while(temp.next.next!=head)
    {
        temp = temp.next;
    }
    int val =temp.data;
    temp.next=head;
    tail = temp;
    size--;
    return val;}


        public int TailElement()
        {
           if(tail==null)return -1;
            return tail.data;
        }


    }
