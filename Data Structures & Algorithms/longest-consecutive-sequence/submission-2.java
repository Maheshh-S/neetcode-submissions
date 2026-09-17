class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
if (nums.length == 0) return 0;
        int cnt = 1, best = 1;
        for(int i = 1 ; i < nums.length; i++){
            if(nums[i] == nums[i-1]) continue;

            int diff = nums[i] - nums[i-1];
            if(diff == 1){
                cnt++;
            }else{
                cnt = 1;
            }

            best = Math.max(cnt , best);
        }
        return best;
    }
}
