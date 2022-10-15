class Solution {
    public int largestRectangleArea(int[] h) {
        int n = h.length;
        int maxarea = 0;
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < n; i++) {
            int currheight = i == n ? 0 : h[i];

            while (!s.isEmpty() && currheight < h[s.peek()]) {
                int top = s.pop();
                int width = s.isEmpty() ? 1 : i - s.peek() - 1;
                int area = h[top] * width;
                maxarea = Math.max(area, maxarea);
            }
            s.push(i);
        }
        return maxarea;
    }
}