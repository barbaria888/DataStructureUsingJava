class qq{
        node head = null;
        node tail = null;
        int size;

        static class node {
            int data;
            node next;
            node prev;

            node(int data) {
                this.data = data;
                this.prev = null;
                this.next = null;
            }

            node(node prev, int data, node next) {
                this.data = data;
                this.prev = prev;
                this.next = next;
            }

            node(int data, node next) {
                this.data = data;
                this.prev = null;
                this.next = next;
            }

            node(node prev, int data) {
                this.data = data;
                this.prev = prev;
                this.next = null;
            }

        }
        public node add(int data){
            node temp =new node(data);
            if(head==null)
            {
                head = temp;
                tail=head;
            }
            tail.next = temp;
            tail  = temp;
            tail.next =null;
            size++;
return temp;

        }
    void Display() {
        node temp = head;
        while (temp != null)
        {
            System.out.print(temp.data + "->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void  swapnodes(node left, node right )
    {
        node temp  = right.next;
        left.next  = temp;
        right.next = left;
    }
node Reverse()
{
            node temp = head;
            node prev=null;
            node next;
            while(temp!=null)
            {
              next = temp.next;
              temp.next = prev;
              prev = temp;
              temp =next;

            }
            head  = prev;
return  null;
}
node GetFromEnd(int ind){
            if(ind<0){
                System.out.println("negative index");
                return null;
            }
    if(ind>=size){
        System.out.println("index out of bounds");
        return null;
    }
    if(ind==-1){
        System.out.println("null");
        return null;
    }
            node temp =head;
            for(int i=1;i<=size;i++){

                if((size-i)==ind){
                    System.out.println(temp.data);
                    return temp;
                }
            temp=temp.next;
            }
    System.out.println("not found");
            return null;
}
void DisplayCircular()
{
    node temp = head;
    while (temp.next!=head)
    {
        System.out.print(temp.data + "->");
        temp=temp.next;
    }
    System.out.println(head.data);

}

void ReverseCircular()
{
        node temp = head;
        node prev=null;
        node next;
        while(temp.next!=head)
        {
            next = temp.next;
            temp.next = prev;
            prev = temp;
            temp =next;

        }
        head  = prev;


    }
    public static void main(String[] args) {

            qq ll =new qq();
            ll.add(5);
        ll.add(4);
        ll.add(3);
        node a =     ll.add(2);
        node b =ll.add(1);

      //  ll.Display();
        qq dl = new qq();
        dl.add(5);
        dl.add(4);
        dl.add(3);
        dl.add(2);
        dl.add(1);
    dl.tail.next =dl.head;

        System.out.println(dl.tail.next.data);
        System.out.println(dl.head.data);
//dl.DisplayCircular();
//dl.ReverseCircular();
//dl.DisplayCircular();
        //swapnodes(a,b);
        //ll.Display();

    }

}