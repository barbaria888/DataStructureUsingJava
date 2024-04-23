import java.util.Scanner;
import java.util.Stack;
class stackquestions {
public static boolean isBalanced(String st) {
    Stack<Character> stack = new Stack<>();
    for(int i=0;i<st.length();i++)
    {   char curr=st.charAt(i);
        if(curr== '('||curr== '['||curr== '{' )
        {
            stack.push(curr);
        }
        else{
                if(stack.size()==0)return false;
                if(stack.peek()=='('||stack.peek()=='['||stack.peek()=='{')stack.pop();
        }
        if(((stack.peek()=='(')&&(curr==')'))||((stack.peek()=='{')&&(curr=='}'))||((stack.peek()=='[')&&(curr==']')))
        {stack.pop();}
        else return false;
    }
        if(!stack.isEmpty())
            {
                return false;
            }

        return true;
    }
    public static void ConsecutiveSubsequence(int [] nums)
    {
        Stack<Integer> st =new Stack<>();

        for(int i=0;i<nums.length;i++)
        {int k=0;
            int j=i+1;
            if(nums[j]==nums[i])
            {
                k++;
            }
        //    if(k>2)


    }}

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {


            Scanner sc = new Scanner(System.in);
            String str = sc.next();
            System.out.println(isBalanced(str));
        }
    }}

