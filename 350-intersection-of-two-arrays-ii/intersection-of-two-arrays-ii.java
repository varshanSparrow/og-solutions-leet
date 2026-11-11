class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> mp1 = new HashMap<>();
        Map<Integer,Integer> mp2 = new HashMap<>();
        for(int x:nums1){
            mp1.put(x,mp1.getOrDefault(x,0)+1);
        }
        for(int y:nums2){
            mp2.put(y,mp2.getOrDefault(y,0)+1);
        }
        int max= 0;
        
        List<Integer> list = new ArrayList<>();
        for(int x:mp1.keySet()){
            if(mp2.containsKey(x)){
                max = Math.min(mp1.get(x),mp2.get(x));
                for(int i=0;i<max;i++){
                    list.add(x);
                }
            }
        }
        int[] ans = new int[list.size()];
        for(int i=0;i<list.size();i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
}