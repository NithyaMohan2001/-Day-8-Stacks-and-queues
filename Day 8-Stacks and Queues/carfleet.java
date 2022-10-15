class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int res = 0;
        double[] timmearr = new double[target];
        for (int i = 0; i < position.length; i++) {
            timearr[position[i]] = (double) (target - position[i]) / speed[i];

            double prev = 0.0;
            for (int i = target - 1; i >= 0; i--) {
                double cur = timearr[i];
                if (cur > prev) {
                    prev = cur;
                    res++;
                }
            }
            return res;
        }
    }
}