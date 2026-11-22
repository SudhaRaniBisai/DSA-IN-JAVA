class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int k=n-1;
        int i=0,j=n-1;
        int[] res = new int[n];
        while(i<j)
        {
            if((nums[i]*nums[i])>=(nums[j]*nums[j]))
            {
                res[k--]=nums[i]*nums[i];
                i++;
            }
            else
            {
                res[k--]=nums[j]*nums[j];
                j--;
            }
        }
        res[0]=nums[i]*nums[i];
        return res;
    }
}