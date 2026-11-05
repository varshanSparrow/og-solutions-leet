class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> map = new HashMap<>();
        for(char x:s.toCharArray()){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        for(char y:t.toCharArray()){
            map.put(y,map.getOrDefault(y,0)-1);
        }
        for(int v:map.values()){
            if(v!=0){
                return false;
            }
        }
        return true;
    }
}