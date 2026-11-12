class Solution {
    public int[] findErrorNums(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int dupl = 0;
        int miss = 0;
        for(int x:nums){
            if(!set.add(x)){
                dupl = x;
            }
            set.add(x);
        }
        for(int i=0;i<=nums.length;i++){
            if(!set.contains(i)){
                miss = i;
            }
        }
        return new int[]{dupl,miss};
    }
}