class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        
        Map<Integer,Integer> mp = new HashMap<>();
        for(int x:nums){
            mp.put(x,mp.getOrDefault(x,0)+1);
        }
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(mp.get(nums[i])==2){
                set.add(nums[i]);
            }
        }
        for(int x:set){
            list.add(x);
    }
        return list;
    }
}