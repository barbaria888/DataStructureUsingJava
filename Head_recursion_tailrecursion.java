
 // head recursion -- answer when stack shrinks
 // tail recursion -- answer when stack grows LAST ACTION IS THE RECURSIVE FUNCTION CALL!!


import java.util.ArrayList;
import java.util.Scanner;

class Facto {
    public static void main(String[] args) {
int num =fact(6);
        System.out.println(num);
    }
// number of stack frames ~  10^4;
public static int fact(int n) {

    if (n<=1)
        return 1;
    int fn = fact(n - 1);
return n*fn;

}
}


class tail_recursion{
    public static long fact(long n , long  ans ){
        if(n==0 || n==1)
        {
            return ans;
        }
        System.out.println( ans+" ");
        return fact(n-1,ans*n);

    }
    public static void printingD(int n){
        if(n==0)
            return ;
        System.out.print(n+" ");//prints the value of n each time it calls n-1
        printingD(n-1); //and then returns


    }
    public static void printA(int a){
        if(a==0) {
            return;
        }
        printA(a-1);//returns the last value of a i.e 1 (before reaching base condition==0)  and then prints
        System.out.print(a +" ");
    }

    public static int fibonacci(int n){
    if(n==0)return 0;
    int ans=0;

    ans+=fibonacci(n-1) +fibonacci(n-2);
return ans;
    }
    public static ArrayList<Integer> FindAllOccurences(int []arr, int tar, int i){
      boolean k=false;

        if(i==arr.length){
            return new ArrayList<Integer>();}
        ArrayList<Integer>ans  = new ArrayList<Integer>();
        if(arr[i]==tar)ans.add(i);
        ArrayList<Integer>ans1  = FindAllOccurences(arr,tar,i+1);
        ans1.addAll(ans);
        return ans1;

    }
    public static int FirstIndex(int []arr,int tar,int i){
        if(arr.length==i)return -1;
        if(arr[i]==tar)return i;
       return FirstIndex(arr,tar,i+1);

    }
    public static int LastIndex(int []arr,int tar,int i){

        if(i==0)return -1;

        if(arr[i]==tar)
        {
            return i;
        }
        return LastIndex(arr,tar,i-1);
    }
    public static String Remove(String str,String inp,int i){
        if(str.length()==i)return "";

        String ans= Character.toString(str.charAt(i));
        String temp =Remove(str,inp,i+1);
        if(!(ans.equals(inp)))
        {
           return ans+=temp;
        }
        return temp;
    }
    public static String RemovalString(String str,String tar){
        if(str.length()==0)return "";
        String ans = RemovalString(str.substring(1),tar);
        char cur = str.charAt(0);
        if(!Character.toString(cur).equals(tar)){
            return cur+ans;
        }
return ans;

    }
    public static String reversalString(String str,int i){
        if(i==str.length())return "";
        String ans = reversalString(str,i+1);
        return  ans+str.charAt(i);
    }
    public static boolean Palindromic(String str,int R,int L){
        if( R >= L )return true;
        return (str.charAt(R)==str.charAt(L) && Palindromic(str,R+1,L-1));
    }
    public static void main(String[] args)
    {
        //System.out.println("tail recursion"+fact(50,1));
     /*   printingD(5);
        System.out.println();
        printA(5);
        System.out.println();
        ArrayList<Integer> nums = FindAllOccurences(new int[]{1,2,3,4,3,45,545,54,54,4,1},1 ,0);
        System.out.println(nums);
        System.out.println(FirstIndex(new int[]{1,2,3,4,3,45,545,54,54,4,1},1 ,0));
        System.out.println(LastIndex(new int[]{1,2,3,4,3,45,545,54,54,4,1},1 ,10));
        System.out.println(Remove("amamm","a",0));
        System.out.println(RemovalString("amamm","a"));
        System.out.println(reversalString("dcba",0));*/
        Scanner sc =new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(Palindromic(s,0,s.length()-1));
    }
}

