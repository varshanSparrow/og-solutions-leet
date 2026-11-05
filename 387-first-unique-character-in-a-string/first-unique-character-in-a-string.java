class Solution {
    public int firstUniqChar(String s) {
        Map<Character,Integer> mp = new HashMap<>();
        for(char x:s.toCharArray()){
            mp.put(x,mp.getOrDefault(x,0)+1);
        }
        for(int i=0;i<s.length();i++){
           if(mp.get(s.charAt(i))==1){
            return i;
           }
        }
        return -1;
    }
}