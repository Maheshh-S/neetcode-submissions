class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;

        HashSet<Integer> set = new HashSet<>();

        int best = 0;
        int len = 1 , curr = 0;

        for(int n : nums){
            set.add(n);
        }

        for(int x : set){
            if(set.contains(x-1)) continue;
            len = 1;
             curr = x;
            
            while(set.contains(curr + 1)){
                curr++;
                len++;
            }

            best = Math.max(len , best);
        }
        return best;
    }
}
