class Solution {
    public int[] exclusiveTime(int n, List<String> logs) {
        int[] res=new int[n];
        Stack<Integer> cpu=new Stack<>();
        int prevtime=0;
        for(String log : logs){
            String[] parts=log.split(":");
            int fid=Integer.parseInt(parts[0]);
            String type=parts[1];
            int time =Integer.parseInt(parts[2]);

            if(type.equals("start")){
                if(!cpu.empty()){
                    res[cpu.peek()]+=time -prevtime;
                }
                cpu.push(fid);
                prevtime=time;
            }else{
                res[cpu.pop()]+= time-prevtime + 1 ;
                prevtime=time+1;
            }

        }
        return res;
    }
}