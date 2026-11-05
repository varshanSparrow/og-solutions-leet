class Solution {
    public String frequencySort(String s) {
        
        Map<Character,Integer> mp = new HashMap<>();
        for(char x:s.toCharArray()){
            mp.put(x,mp.getOrDefault(x,0)+1);
        }
        String res = "";
        List<Character> list = new ArrayList<>(mp.keySet());
        list.sort((a,b) -> mp.get(b)-mp.get(a));
        for(char x:list){
            for(int i=0;i<mp.get(x);i++){
                res+=x;
            }
        }
        return res;
    }
}