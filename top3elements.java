import java.util.Arrays;

class inp{
    public static void swap(int []arr,int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void max3(int [] nums)
    {int second,max=0,third;
 for(int i=0;i<nums.length-1;i++)
 {
     for(int j=i+1;j<nums.length;j++)
     if(nums[j]>nums[i])
     {
         swap(nums,i,j);
     }
 }
 for(int i=0;i<3;i++)
        System.out.print(nums[i]+" ");

            }
    //max 3 elements and print in descending order
    public static void main(String[] args) {
        int [] arr =new int []{1,234,4,4,1,23,256702,-1,Integer.MAX_VALUE};
        max3(arr);
    }
}