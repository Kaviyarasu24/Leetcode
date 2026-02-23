class Solution {
    public boolean hasAllCodes(String s, int k) {
        Set<String> val=new HashSet<>();
        for(int i=0;i<=s.length()-k;i++){
            val.add(s.substring(i,i+k));
        }
        return val.size()==Math.pow(2,k);
        
    }
}