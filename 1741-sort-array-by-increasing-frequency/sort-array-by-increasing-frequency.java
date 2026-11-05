class Solution {
    public int[] frequencySort(int[] nums) {
        
        Map<Integer,Integer> mp = new HashMap<>();
        for(int x:nums){
            mp.put(x,mp.getOrDefault(x,0)+1);
        }
        List<Integer> list = new ArrayList<>(mp.keySet());
        list.sort((a,b)->{
            if(mp.get(a).equals(mp.get(b))){
                return b.compareTo(a);
            }
            return mp.get(a)- mp.get(b);
        });
        int indx = 0;
        int[] res = new int[nums.length];
        for(int x:list){
            mp.get(x);
            for(int i=0;i<mp.get(x);i++){
                res[indx] = x;
                indx++;
            }
        }
        return res;

        
        
    }
}