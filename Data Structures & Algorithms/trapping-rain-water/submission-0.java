class Solution {
    public int trap(int[] height) {
        int n = height.length;

        int l = 0 , r = n-1;
        int LM = height[l];
        int RM = height[r];
        int twater = 0;
        while(l < r){
                
                if( LM < RM){
                    l++;
                    LM = Math.max(LM , height[l]);
                    twater += LM - height[l];
                }else{
                    r--;
                    RM = Math.max(RM , height[r]);
                    twater += RM - height[r];
                }
        }
        return twater;
    }
}
