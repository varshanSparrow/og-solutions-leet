class Solution {
    public int[] frequencySort(int[] nums) {
        

        Map<Integer,Integer> mp = new HashMap<>();
        for(int x:nums){
            mp.put(x,mp.getOrDefault(x,0)+1);
        }
        List<Integer> list = new ArrayList<>(mp.keySet());
        list.sort((a,b)->{
            if(mp.get(a).equals(mp.get(b))){
                return b-a;
            }
            return mp.get(a)-mp.get(b);
        });
        int[] res = new int[nums.length];
        int idx = 0;
        for(int x:list){
            for(int i=0;i<mp.get(x);i++){
                res[idx] = x;
                idx++;
            }
        }
        return res;
    }
}