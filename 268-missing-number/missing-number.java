class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        for(int x:nums){
            sum+=x;
        }
        int exp = 0;
        int len = nums.length+1;
        for(int i=0;i<len;i++){
            exp+=i;
        }
        int ans = exp-sum;
        return ans;
    }
}