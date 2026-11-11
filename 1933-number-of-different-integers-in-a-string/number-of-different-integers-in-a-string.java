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
        String[] arr = str.toString().split(" ");
        Set<String> set  = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i].isEmpty()){
                continue;
            }
            arr[i] = arr[i].replaceFirst("^0+", "");
            if(arr[i].isEmpty()){
                arr[i] = "0";
            }
            set.add(arr[i]);
        }
        return set.size();
    }
}