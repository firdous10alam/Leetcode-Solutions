class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int[] res = new int[n+1];
        res[0] = 0; 
        int sum = 0;

        for(int i = 1; i < n+1; i++) {
            sum = sum + gain[i-1];
            res[i] = sum;
        }
        int max = res[0];
        for (int i = 1; i < n + 1; i++) {
            if (res[i] > max) max = res[i];
        }
        return max;   
    }
}