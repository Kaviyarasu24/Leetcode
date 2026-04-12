class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int size=temperatures.length;
        int[] warmday=new int[size];
        for(int i=0;i<size;i++){
            int min=0;
            for(int j=i+1;j<size;j++){
                if (temperatures[j]>temperatures[i]){
                    min=j-i;
                    break;
                }
            }
            warmday[i]=min;
        }
    return warmday;
    }
}