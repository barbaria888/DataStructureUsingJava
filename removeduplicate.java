import java.util.*;
public class removeduplicate {
    public static int removeDuplicates2(int[] nums) {
            int j=1;
            for(int i=1;i<nums.length;i++)
            {
                if(j==1||nums[i]!=nums[j-2])
                {
                        nums[j]=nums[i];
                        j++;
                }
            }return j;
        }

        public static void main(String[]args)
        {
            int nums[] = new int[]{1,1,1,2,2,3,3,3,4,4,4,4,4,4};
            int j=removeDuplicates2(nums);
            for(int i=0;i<j;i++)
            {
                System.out.print(nums[i]+" ");
            }
        }
    }

