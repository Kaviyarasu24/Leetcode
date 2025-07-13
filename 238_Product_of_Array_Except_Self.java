class Solution {
    public int[] productExceptSelf(int[] nums) {
        int size=nums.length;
        int outnums[]=new int[size];
        for(int i=0;i<size;i++){
            int prod=1;
            for(int j=0;j<size;j++){
                if(i!=j){prod=prod*nums[j];}
            }
            outnums [i]=prod;
        }
    return outnums;    
    }
}