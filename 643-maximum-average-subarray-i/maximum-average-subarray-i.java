class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;

        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
      int window = sum;
        for(int i=0;i<nums.length-k;i++){
             window = window-nums[i]+nums[i+k];

            if(window>sum){
                sum=window;
            }

        }
        return (double)sum/k;
    }
}