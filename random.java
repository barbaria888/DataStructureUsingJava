/*
class linkedlin{
    public static void printIt(int n){
        if(n==0)return;
        System.out.println(n);
        printIt(n-1);
    }
    public static void printing(int n)

    {
        int temp=0;

        if(temp==n)
        return;

        //printing(n+1);
        for(int i=n;i>=0;i--){
            System.out.print("*");
        }
        System.out.println();


    }
    public static int power(int p,int q){
        if(q<0)return p/ power(p,q+1);
        if(q==0)return 1;

        return p*power(p,q-1);
    }

    public static  int pow(int p,int q){
        if(q==0)return 1;
        int ans = pow(p,q/2);
        if(q%2==0)
        {
            return ans/ans;
        }
        return ans*ans*p;
    }

    public static int sod(int x){

        if(x==0)return x;
        int ans = sod(x/10);
        return ans + x%10;

    }

    public static int lcm(int a,int b){
        int lcm = a > b ?a : b ;
        while( true)
        {
            if((lcm % a == 0 ) && (lcm%b  == 0))
            return lcm;
            lcm++ ;
        }

    }
    public static int lcmR(int a,int b){
        int lcm = a > b ?a : b ;
        if((lcm%a==0) &&(lcm%b==0))
                return lcm;
        return lcmR(lcm+1,b+1);

    }

   /* public static void main(String[] args) {
      // printing(5);
//printIt(5);
        //System.out.println(sod(11));
  //      System.out.println(factorial(78));
        //System.out.println(power(2,5));
        //System.out.println(pow(2,-1));
        System.out.println(lcm(2,5));
        System.out.println(lcmR(2,5));

    }
    public static long factorial(long n)
    {
        if(n==0)return 1;
          return  n*=factorial(n-1);
    }

}*/

class asdf{
public static boolean CheckPalindrome(String str)
    {
        boolean f = false;
        for(int i=0;i<str.length();i++)
        {
            int j=str.length()-i-1;
             if(str.charAt(i)==str.charAt(j))
             {
                 f=true;
             }
        }
        return f;
    }
public static int recurse(String str)
{
    if(CheckPalindrome(str))
    {
        return 1;
    }

    StringBuilder s =new StringBuilder(str);
    s.replace(0,str.length()-1,str);
    System.out.println(s);
    str = s.toString();
    return recurse(str);
}
    public static void main(String[] args) {
        String af = "af";
        //System.out.println(recurse("af"));
        String str = "a1";
        StringBuilder sb = new StringBuilder(str);
        /*while(i!=str.length||!CheckPalindrome(sb))
            i++;*/
        for (int i = 0; i < sb.length(); i = (i + 1) % sb.length()) {
            char temp = sb.charAt(i);
            sb.deleteCharAt(sb.length() - 1);
            sb.insert(sb.length() - 1, temp);
            System.out.println(sb);
            if (CheckPalindrome(sb.toString())) break;

        }

    }
}





