class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        List<Integer> result=new ArrayList<>();
        int index=0;
        for(int i=1;i<=n;i++){
            while (index < n && nums[index] < i) {
                index++;   
            }

            if (index >= n || nums[index] != i) {
                result.add(i);  
            } else {
                index++;
            }
       }    
    return result;    
        
    }
}