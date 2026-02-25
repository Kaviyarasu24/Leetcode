class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> merg=new ArrayList<Integer>();
        for(int a:nums1){
            merg.add(a);
        }
        for(int b:nums2){
            merg.add(b);
        }
        Collections.sort(merg);
        int size=merg.size();
        if(size%2==0){
            return (merg.get(size/2)+merg.get((size/2)-1))/2.0;
        }else{
            return merg.get(size/2);
        }
    }
}