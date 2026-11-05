class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> mp = new HashMap<>();
        for(int x:nums){
            mp.put(x,mp.getOrDefault(x,0)+1);
        }
        for(int i=0;i<nums.length;i++){
            if(mp.get(nums[i])>nums.length/2){
                return nums[i];
            }
        }
        return -1;
    }
}