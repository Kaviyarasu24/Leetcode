class Solution {
    public int bitwiseComplement(int n) {
        String bina=Integer.toBinaryString(n);
        String flipped="";
        for(char a: bina.toCharArray()){
            if(a=='1'){
                flipped+='0';
            }else{
                flipped+='1';
            }
        }
        return Integer.parseInt(flipped,2);
    }
}