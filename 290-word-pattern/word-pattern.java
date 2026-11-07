class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        String[] words = s.split("\\s+");
        if(pattern.length()!=words.length){
            return false;
        }
        Map<Character,String> mp1 = new HashMap<>();
        Map<String,Character> mp2 = new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            char a = pattern.charAt(i);
            String b = words[i];
            if(mp1.containsKey(a)){
                if(!mp1.get(a).equals(b)){
                    return false;
                }
            }
            mp1.put(a,b);
            if(mp2.containsKey(b)){
                if(!mp2.get(b).equals(a)){
                    return false;
                }
            }
            mp2.put(b,a);
        }
        return true;
    }
}