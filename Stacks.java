import java.util.Arrays;

public class Stacks
{
    int size;
    int top;
    int [] arr;

    Stacks(int length)
    {
        this.size = length;
        this.top =-1;
        this.arr  =new int [length];
    }

    public void push(int data)
    {
        if(top>(size-1))
        {
            throw new IllegalStateException("Stack overflow");
        }
        top++;
        arr[top]  = data;
    }
    public int pop()
    {
        if(top==-1)
        {
            System.out.println("Stack Underflow:Can't pop from empty stack");
            return 1;
        }
        size--;
        return arr[top--];
    }
    public int peek()
    {
        if(top<0)
        {throw new IllegalStateException("StackUnderflow");}
        return arr[top];
    }
    public boolean isEmpty()
    {
        return top==-1;
    }


    public int [] ConvertToArray(Stacks st){
        int []nums=new int[st.size];
        for(int i=0;i<st.size;i++)
        {
            nums[i] =  st.pop();
        }
        return nums;
    }


public  void Display(int i){
    if(i<0){System.out.println();return;}
    System.out.print(arr[i]+" ");
    Display(i-1);
    //System.out.print("-----------------------------");
    System.out.print("-----------------------------");

    }
public void PrintAndDelete()
{
    while(!isEmpty())
    System.out.print(pop()+" ");
}
    public void PushAtBottom(int ele)
    {
        if(size ==0){push(ele);return;}
        int top =pop();
        System.out.print(top+" ");
        PrintAndDONTDelete();
        push(top);
    }
    public void PrintAndDONTDelete()
    {
        if(size ==0)return;
        int top =pop();
        System.out.print(top+" ");
        PrintAndDONTDelete();
        push(top);
    }


    public static void main(String[] args) {
        Stacks st = new Stacks(6);
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.Display(4);
        System.out.println();
        //st.PrintAndDONTDelete();

int [] nums =st.ConvertToArray(st);
        System.out.println(nums[3]);

        //st.push(6);
        //System.out.println(st.peek());
    }
}