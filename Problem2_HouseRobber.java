// Time Complexity : o(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public int rob(int[] nums) {
        
        if(nums.length==0)
            return 0;
        if(nums.length==1)
            return nums[0];
        
        int[] dp=new int[nums.length];
        
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]);
        
        for(int i=2;i<nums.length;i++)
        {
            dp[i]=Math.max(dp[i-1],dp[i-2]+nums[i]);
        }
        
    return dp[nums.length-1];
}
}
