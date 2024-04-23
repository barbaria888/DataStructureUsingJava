import java.util.Arrays;
import java.util.Scanner;

class lkg{
    public static int match(int []price,int money)
    {
        if(price[0]-money == 0)return 1;
        return 0;
    }


    public static void main(String[] args)
{
    int n,v;
    Scanner sc =new Scanner(System.in);
        n=sc.nextInt();
        v=sc.nextInt();
        int [][]price =new int[n][];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;i++)
                price[i][j]= sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {

        }
                int i=0;
        while(v - price[i][1]!=0)
        {

        }
    //match(price,v);
}
}