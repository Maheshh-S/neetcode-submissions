class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int ans = 0;
        int left = 0;
        Set<Character> set = new HashSet<>();


        for(int r = 0 ;r < n;r++){
            
            char ch = s.charAt(r);

            while(set.contains(ch)){
                char lch = s.charAt(left);
                set.remove(lch);
                left++;
            }


            set.add(ch);
        ans = Math.max(r-left+1 , ans);
        }
        return ans;
    }
}
