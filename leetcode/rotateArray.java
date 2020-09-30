class Solution {
    public void rotate(int[] nums, int k) {
        int pos=k%nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,pos-1);
        reverse(nums,pos,nums.length-1);
    }
    public void reverse(int[] nums,int start,int end){
      int temp;
      while(start<end){
        temp=nums[start];
        nums[start]=nums[end];
        nums[end]=temp;
        start++;
        end--;
      }
    }
}
