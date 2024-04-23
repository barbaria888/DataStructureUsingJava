import java.util.Arrays;

class sort{
    public static void swap(int []arr,int i ,int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
    public static  void bub_sort(int []arr)
    {boolean swapped=true;
        int k=0;
        while(swapped)

        {
            swapped=false;
            for(int i=0;i<arr.length-1;i++)
            {
                if(arr[i]>arr[i+1])
                {
                    int temp =arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                    swapped =true;
                    k++;
                }
            }k++;
        }
        System.out.println("k->"+k);
    }
   public static void bumblesort(int []arr){
    int k=0;
      for(int i=0;i<arr.length-1;i++)
        for(int j=i+1;j<arr.length-1;j++)
        {
            if(arr[j]<arr[i])
            {
                swap(arr,i,j);
                k++;
            }
            k++;
        }
       System.out.println("k->"+k);
    }
    public static void main(String[] args) {
int [] nums =new int[] {Integer.MAX_VALUE,12312,9084,1243,567,45,33,32,5,Integer.MIN_VALUE,-1};
bumblesort(nums);
//        bub_sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
class ins_srt
{// Time Complexity - 0 (n)-->best case
    //Time complextiy - 0 (n^2) -->worst case
    //Spcae complexity - 0(1) --> no auxillary space
    public static void swap(int arr[],int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void InsertionSort(int [] nums)

    {
        int n =nums.length;
        for(int i=1;i<n;i++)
        {
            int j=i;
            while(j>0 && nums[j]>nums[j-1])
            {
                swap(nums,j-1,j);
                j--;
            }

        }
    }
    public static void main(String[] args) {
     //return

        int [] nums =new int[] {Integer.MAX_VALUE,12312,9084,1243,567,45,33,32,5,Integer.MIN_VALUE,-1};
        System.out.println(Arrays.toString(nums));
        InsertionSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
class selection_srt{
    public static void swap(int []arr,int i ,int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
     public static void SelectionSort(int arr[])
     {int n=arr.length;
         int k=0;
         for(int i=0;i<n-2;i++)
         {
             int min = i;
             for (int j=i+1;j<n;j++)
             {
                 if(arr[j]<arr[min])
                 {min=j;k++;}
             }
             if(i!=min)
             swap(arr,i,min);
             k++;
         }
         System.out.println("k->"+k);

     }

    public static void main(String[] args) {

        int []arr ={4,3,2,1,5};
        int [] nums =new int[] {Integer.MAX_VALUE,12312,9084,1243,567,45,33,32,5,Integer.MIN_VALUE,-1};
        //System.out.println(Arrays.toString(nums));
        //Arrays.sort();
        System.out.println(Arrays.toString(nums));
    }
}
