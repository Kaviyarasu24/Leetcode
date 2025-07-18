class Solution {
    public int[] searchRange(int[] nums, int target) {
        List<Integer> output = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if (nums[i]==target){
                output.add(i);
            }
        }
        if (output.isEmpty()){
            return new int[]{-1,-1};
        }
        else{
            return new int[]{output.get(0), output.get(output.size() - 1)};
        }
    }
}

