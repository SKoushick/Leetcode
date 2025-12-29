class Solution {
    public int longestSubarray(int[] nums, int k) {
       int n=nums.length,left=0,right=0,maxi=0;
       int sum = nums[0];
       while(right<n){
        while(left<=right && sum>k){
            sum-=nums[left];
            left++;
        }
        if(sum==k){
            maxi=Math.max(maxi,right-left+1);
        }
        right++;
        if(right<n){
            sum+=nums[right];
        }
       }
       return maxi;
    }
}
