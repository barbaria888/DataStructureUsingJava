import java.util.IllformedLocaleException;

class Queue{
int front=-1;
int rear=-1;
int [] arr;
int size=50;
    public Queue()
    {
        this.arr = new int [size];
        this.front=0;
    }
    public Queue (int length)//constructor for instantiating
    {   this.size= length;
        this.arr = new int[size];
        this.front=0;
    }
    public void Enqueue(int data)
    {
        if(rear>=arr.length)
            {throw new IllegalStateException("Queue OverFlow" );}
        arr[++rear] =  data;
        if(arr.length==1)front =rear;
        size++;
        //System.out.println(arr[rear]);
    }
    public int Dequeue()
    {   if(front>rear)
            throw new IllegalStateException("Queue UnderFlow: "+ rear +" out of index for "+size );
        rear--;
    return arr[front++];
    }
    public  int  LastElement() throws Exception
    {
            if(arr.length==0)
        {
            throw new Exception("Queue underflow");
        }
        return arr[rear];
    }
    public void PrintQueue(){
        System.out.print("Front");
        for(int i=front;i<=rear;i++)
        {
            System.out.print("|"+arr[i]+"|");

        }
        System.out.print("Rear");
    }
    public void ResetWholeQueue(){
        for(int i=0;i<rear;i++)
        {
            arr[i]=0;

        }
    }

    public int Front_Element() throws Exception{
        if(arr.length==0)
        {
            throw new Exception("Queue underflow");
        }
        return arr[front];
    }
    public int Find(int tar,int i) throws Exception {
        if (arr.length == 0) {
            throw new Exception("OutOfBounds");
        }
        if (arr[i] == tar) return i;
        Find(tar , i + 1);

    return -1;}

    public static void main(String[] args) throws Exception {
        Queue qq= new Queue();
        qq.Enqueue(5);
        System.out.println(qq.front);
        qq.Enqueue(4);
        qq.Enqueue(3);
        qq.Enqueue(2);
        qq.Enqueue(1);qq.Enqueue(0  );
        System.out.println(qq.rear);
        qq.PrintQueue();
        System.out.println();
        for(int i=0;i<qq.rear;i++) {
            System.out.print(qq.Dequeue());
            qq.Enqueue(qq.front);
        }

        //qq.ResetWholeQueue();
        //qq.Dequeue();
        qq.PrintQueue();
        //System.out.println(qq.Find(3,0));

    }
}