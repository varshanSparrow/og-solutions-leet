class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        Map<Integer,Integer> mp = new HashMap<>();
        for(int x:nums){
            mp.put(x,mp.getOrDefault(x,0)+1);
        }
        List<Integer> list = new ArrayList<>();
        for(int i=1;i<nums.length+1;i++){
            if(!mp.containsKey(i)){
                
                list.add(i);
            }
        }
       
        return list;
    }
}