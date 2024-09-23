public class leetcode31{
    public static  int[] swap(int index1,int index2,int[] nums){
        int temp =nums[index1];
        nums[index1]=nums[index2];
        nums[index2]=temp;
        return nums;
    }
    public static  int[] rev(int[] nums,int start,int end)
    {
        for(int i=start,j=end;i<=j;i++,j--)
        {
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }
        return nums;
    }
    public static  void nextPermutation(int[] nums) {
        int index=-1;
        for(int i=nums.length-2;i>=0;i--)
        {
            if(nums[i]<nums[i+1])
            {
                index=i;
                break;
            }
        }
        if(index==-1)
        {
            nums=rev(nums,0,nums.length-1);
        }
        else
        {
            for(int i=nums.length-1;i>index;i--)
            {
                if(nums[index]<nums[i])
                {
                    nums=swap(index,i,nums);
                    nums=rev(nums,index+1,nums.length-1);
                    break;
                }
            }
        }
        for (int idx = 0; idx < nums.length; idx++) {
            System.out.print(nums[idx]);
            
        }
    }
    public static void main(String[] args) {
        int[] nums={2,1,5,4,3,0,0};
        nextPermutation(nums);
    }
}