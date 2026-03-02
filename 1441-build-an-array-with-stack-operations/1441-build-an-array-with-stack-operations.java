class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> result=new ArrayList<>();
        int targetindex=0;
        for(int i=1;i<=n;i++){
            if(targetindex==target.length){
                break;
            }
            result.add("Push");
            if(i==target[targetindex]){
                targetindex++;
            }else{
                result.add("Pop");
            }
        }
    return result;
        
    }
}