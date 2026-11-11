class Solution {
    public int numDifferentIntegers(String word) {
        StringBuilder str = new StringBuilder();
        for(char x:word.toCharArray()){
            if(Character.isDigit(x)){
                str.append(x);
            }
            else{
                str.append(" ");
            }
        }
        // str = [" 123 34 8 34"];
        String s = str.toString();
        String[] arr = s.split(" +");
        //arr = ["123", "34", "8", "34"]
        Set<String> set = new HashSet<>();
        for(String x:arr){
            if(x.isEmpty()){
                continue;
            }
            x = x.replaceFirst("^0+","");
            if(x.isEmpty()){
                x = "0";
        
            }
            set.add(x);
        }
        return set.size();
        
    }
}