class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer,Integer> mp = new HashMap<>();
        mp.put(0,-1);
        int sum = 0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                sum--;
            }
            else{
                sum++;
            }
            int len=0;
            if(mp.containsKey(sum)){
                len = i-mp.get(sum);
            }
            max = Math.max(len,max);
            if(!mp.containsKey(sum)){
                mp.put(sum,i);
            }
        }
        return max;
    }
}