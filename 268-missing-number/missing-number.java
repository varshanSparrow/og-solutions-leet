class Solution {
    public int missingNumber(int[] nums) {
        Map<Integer,Integer> mp = new HashMap<>();
        for(int x:nums){
            mp.put(x,mp.getOrDefault(x,0)+1);
        }
        for(int i=0;i<nums.length+1;i++){
            if(!mp.containsKey(i)){
                return i;
            }
        }
        return -1;
    }
}