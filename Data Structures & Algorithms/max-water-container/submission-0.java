class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;

        int l = 0 ;
        int r = n-1;
        int ans = 0;
        int area = 0;
        while( l < r){

            int h = Math.min(heights[l] , heights[r]);
            int w = r - l;

            area = h * w;

            if(heights[l] < heights[r]){
                l++;
            }else{
                r--;
            }
            ans = Math.max(ans , area);
        }
        return ans;
    }
}
