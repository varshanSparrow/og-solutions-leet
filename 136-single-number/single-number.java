class Solution {
    public int singleNumber(int[] nums) {
        
        Map<Integer,Integer> mp = new HashMap<>();
        for(int x:nums){
            mp.put(x,mp.getOrDefault(x,0)+1);

        }
        for(int y:nums){
            if(mp.get(y)==1){
                return y;
            }
        }
        return -1;
    }
}