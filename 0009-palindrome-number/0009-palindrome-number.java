class Solution {
    public boolean isPalindrome(int x) {
        int dup=x;
        int revnum=0;
        while(x>0){
            int last=x%10;
            revnum=(revnum*10)+last;
            x/=10;
        }
    if(revnum==dup){
        return true;
    }else{
        return false;
    }}
}