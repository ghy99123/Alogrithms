class Solution {
    public int maxSubArray(int[] nums) {
      //dp[i]中保存的是以nums[i]结尾的最长公共字串，值为nums[i]或者nums[i]+dp[i-1]
      int[] dp=new int[nums.length];
      //初始化
      dp[0]=nums[0];
      int ans=nums[0];  //当前最长字串
      for(int i=1;i<nums.length;i++){
        dp[i]=Math.max(nums[i],nums[i]+dp[i-1]);
        ans=Math.max(dp[i],ans);     
      }
      return ans;
    }
}
