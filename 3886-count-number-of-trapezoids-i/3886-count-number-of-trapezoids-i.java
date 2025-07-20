import java.util.*;
class Solution {
    public int countTrapezoids(int[][] points) {
        Map<Integer,Integer> ycount =new HashMap<>();
        int mod=1_000_000_007;
        for(int[] p:points){
           ycount.merge(p[1],1,Integer::sum);
        }
        Integer[]ylevels= ycount.keySet().toArray(new Integer[0]);
        long total=0;
        for(long count:ycount.values()){
            long seg = count*(count-1)/2;
            total+=seg;
        }
        long result=0;
        for (long count: ycount.values()){
            long seg =count*(count-1)/2;
            total-=seg;
            result=(result+seg*total%mod)%mod;
        }
        return (int)result;
    }
}