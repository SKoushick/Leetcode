class Solution {
    public int longestSubarray(int[] nums, int k) {
       int n=nums.length;
       HashMap<Integer,Integer> PresumMap = new HashMap<>();
       int sum =0,maxLen=0;
       for(int i=0;i<n;i++){
        sum+=nums[i];
        if(sum==k){
            maxLen=i+1;
        }
        int rem=sum-k;
        if(PresumMap.containsKey(rem)){
            int len =i-PresumMap.get(rem);
            maxLen=Math.max(maxLen,len);
        }
        if(!PresumMap.containsKey(rem)){
            PresumMap.put(sum,i);
        }
       }
       return maxLen;
    }
}
