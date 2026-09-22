class Solution {
    public int largestRectangleArea(int[] heights) {
        int maxA = 0;
        Stack<Integer> st = new Stack<>();

        int n = heights.length;

        for(int i = 0 ;i <= n; i++){
            int h = (i == n) ? 0 : heights[i];

            while(!st.isEmpty() && h < heights[st.peek()]){
                int hi = heights[st.pop()];
                int w = st.isEmpty() ? i :  i - st.peek()-1;
                maxA = Math.max(maxA , hi * w);
            }

            st.push(i);
        }
        return maxA;
    }
}
