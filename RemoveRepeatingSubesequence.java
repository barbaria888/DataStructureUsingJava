import java.util.Arrays;
import java.util.Stack;
class RemoveRepeatingSubsequences{

    public static int[] Removal(int[]nums)
    {
        int k=1;
        Stack<Integer> st =new Stack<>();
        int [] arr=new int[nums.length];
        for (int i = 0; i < nums.length-2 ; i++) {
            if(st.isEmpty())
            {
                k++;
                st.push(nums[i]);
            }
            if(st.peek()!=nums[i])
            {
                if(nums[i]!=nums[i+1])
                {
                 arr[i]= st.pop();
                }
            }
        }

        System.out.println(Arrays.toString(arr  ));
        for (int j = 0; j < k ; j++) {
            arr[j]=nums[j];
        }
        return arr;}

    public static void main(String[] args) {
        int arr []= {10,2,2,4,10,10,10,4,4,4,5,7,7,2};
        int nums[]=Removal(arr);
        System.out.println(Arrays.toString(nums));
    }
}