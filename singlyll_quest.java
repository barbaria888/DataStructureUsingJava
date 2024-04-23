import java.util.Scanner;

class q {
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

        node(node prev,int data) {
            this.data = data;
            this.prev = prev;
            this.next = null;
        }

           }
public static node  intersection(node h1,node h2){
        node t1;
        node t2=h2;
        while(t2!=null)
        {t1 = t2;
            while(t1!=null)
            {
                    if(t1 == t2)
                    {
                        System.out.println("found match !! ");
                        return  h2;
                    }
                    t2 = t2.next;
            }
            t1=t1.next;
        }
        return null;
}
    public static void intersect(node h1,node h2)
    {   if(h1==null||h2==null){
        System.out.println("not found");
        return ;}
        node t1 =h1;node t2=h2;
        if(t1.data==t2.data)
        {

            System.out.println("found it !!!");
            return;
        }
        t1=t1.next;
        intersect(t1,t2.next);
    }
public static node LastNode(node head){
        node temp=head;
        if(temp==null)return new node(-1);
        if(temp.next==null)return temp;
        return LastNode(temp.next);
}
    public static void AddInAhead(node left ,node enter,node right)
    {
        left.next =enter;
        enter.next=right;
        right.prev=enter;
    }
    public void search(int tar)
    {
        node temp = head;
        int i=0;boolean k=false;
        while(temp!=null)
        {
            if(temp.data==tar)
            {
                System.out.println("found at "+i);
                k=true;
                return;
            }

            i++;
            temp=temp.next;
        }
        if(!k)
            System.out.println(-1);

    }

    public void add(int data){
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


    }
    public int mid()
    {node temp=head;
        int s=0;
        if(size==0)return 0;
        for(int i=0;i<(size/2);i++)
        {

            temp=temp.next;
        }
        return temp.data;
    }
    public static void  swapnodes(node left,node right )
    {
        node temp  = right.next;
        left.next = temp;
        right.next = left;
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
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //System.out.println("enter the size");
        q lll  = new q();
        q ll = new q();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        lll.add(50);
        lll.add(40);
        lll.add(30);
        lll.add(20);
        lll.add(10);
        System.out.println(intersection(ll.head,lll.head).data);
        /*
        int n=sc.nextInt();
        for (int i=0;i<n;i++)
        {
         lll.add(sc.nextInt());
        }
        lll.Display();*/
        //System.out.println(lll.mid());
       // System.out.println("enter the number to search");
        //int tar = sc.nextInt();
        //System.out.println((LastNode(lll.head).data));//lll.search(tar)
        // ;
    }


}
