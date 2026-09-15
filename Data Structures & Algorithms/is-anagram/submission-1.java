class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        int m = t.length();

        HashMap<Character , Integer> map = new HashMap<>();

        if(n != m) return false;

        for(char c : s.toCharArray()){
            map.put(c , map.getOrDefault(c,0)+1);
        }

        for(char c : t.toCharArray()){
            if(map.containsKey(c)){
                map.put(c , map.getOrDefault(c,0)-1);
                if(map.get(c) == 0){
                    map.remove(c);
                }
            }else{
                return false;
            }
        }
        return true;
    }
}
