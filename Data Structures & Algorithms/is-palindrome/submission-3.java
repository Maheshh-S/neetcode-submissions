class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]" , "");
        s = s.toLowerCase();
        int n = s.length();
    //    if(n == 1)return false;

        int l = 0;
        int r = n-1;
       //int[] charArr = s.charArray();
        System.out.println(s);
        while( l < r){
            if(s.charAt(l) != s.charAt(r)){
                return false;
            }

            l++;
            r--;

        }
        return true;
    }
}
