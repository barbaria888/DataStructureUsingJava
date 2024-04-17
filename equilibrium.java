import java.util.Arrays;

class ost{
    public static int equal(int [] arr,int start,int mid)
    {
        int sum1=Integer.MAX_VALUE;
        int sum2 = Integer.MAX_VALUE;
        int n = arr.length;
        if(mid==0)return -1;
        if((sum1==0)&&(sum2==0))return 0;
        sum1 += equal(arr,0,mid-1);

        sum2 += equal(arr,mid+1,n-1);
        if(n==0)return 0;
        if(sum1==sum2)return mid;
        return arr[mid];
    }
        public static int arrayEquilibriumIndex(int[] arr){
            int leftsum=0,totalsum=0, rightsum=0,n = arr.length;
                for (int i=0;i<n;i++)
                    totalsum+=arr[i];
               for (int i=0;i<n;i++)
               {
                   rightsum = totalsum - leftsum-arr[i];
                   if(leftsum==rightsum)
                       return i;
                    leftsum=leftsum+arr[i];
                                  }
            return -1;
        }

    public static void main(String[] args) {
        int [] arr = {11 ,11, 25 ,2 ,53 ,15 ,29 ,5 ,5 ,25 ,22 ,14 ,6 ,34 ,172 ,5 ,1 ,65 ,318 ,206, 25, 269};
        int [] num = {1,2,-22,2,-21};
        System.out.println(arrayEquilibriumIndex(arr));
        //stem.out.println(equal(arr,1,1));
            //System.out.println(Arrays.toString(arr));
    }
}