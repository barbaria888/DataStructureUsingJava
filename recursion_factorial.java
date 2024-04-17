import java.util.Scanner;

class RECURSION{
public static int  fibon(int n){
    if(n==0)return 1;
    return  n+fibon(n-1);
}
    public static long factorial(long n)
    {
        if(n==0)return 1;
        return  n*=factorial(n-1);
    }

    public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    try {
        System.out.println("Enter number to get facorial ");
int n =sc.nextInt();
    long ans = factorial(n);
        System.out.println(ans);
        System.out.println("Enter number to get fibbonacci ");
        int num = sc.nextInt();
        System.out.println(fibon(num));

}
catch(Exception e)
{
    System.out.println(e);
}
}
}