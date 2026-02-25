class Solution {
    public int kthFactor(int n, int k) {
        ArrayList<Integer> factors=new ArrayList<>();
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                factors.add(i);
                if (i != n / i) {
                    factors.add(n / i);
                }
            }
        }
        Collections.sort(factors);
        if (k > factors.size()) {
            return -1;  
        }
        return factors.get(k-1);
    }
}