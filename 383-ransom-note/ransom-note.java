class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> mp = new HashMap<>();
        for(char y:magazine.toCharArray()){
            mp.put(y,mp.getOrDefault(y,0)+1);
        }
        for(char x:ransomNote.toCharArray()){
            if(!mp.containsKey(x)||mp.get(x)<=0){
                return false;
            }
            mp.put(x,mp.getOrDefault(x,0)-1);
        }
        return true;
    }
}