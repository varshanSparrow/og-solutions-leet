class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        if(s.length()!=t.length()){
            return false;
        }
        Map<Character,Character> mp1 = new HashMap<>();
        Map<Character,Character> mp2 = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char a = s.charAt(i);
            char b = t.charAt(i);
            if(mp1.containsKey(a)){
                if(!mp1.get(a).equals(b)){
                    return false;
                }
            }
            
            if(mp2.containsKey(b)){
                if(!mp2.get(b).equals(a)){
                    return false;
                }
            }
            mp2.put(b,a);
            mp1.put(a,b);
        }
        return true;
    }
}