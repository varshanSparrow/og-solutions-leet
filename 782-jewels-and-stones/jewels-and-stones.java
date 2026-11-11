class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        
        Map<Character,Integer> mp = new HashMap<>();
        for(Character x:jewels.toCharArray()){
            mp.put(x,mp.getOrDefault(x,0)+1);
        }
        int count = 0;
        for(char y:stones.toCharArray()){
            if(mp.containsKey(y)){
                count++;
            }
        }
        return count;
    }
}