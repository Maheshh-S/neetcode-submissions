class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        int m = t.length();

        // HashMap<Character , Integer> map = new HashMap<>();
        int[] f1 = new int[26];
        int[] f2 = new int[26];


        if(n != m) return false;

        for(char c : s.toCharArray()){
            int ch = c - 'a';
            f1[ch]++;
        }

        for(char c : t.toCharArray()){
            int ch = c - 'a';
            f2[ch]++;
        }

        if(Arrays.equals(f1 , f2)){
            return true;
        }
        return false;
    }
}
