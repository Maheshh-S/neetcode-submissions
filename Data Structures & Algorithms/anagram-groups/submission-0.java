class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();
        if(strs == null || strs.length == 0){
            return new ArrayList<>();
        }

        Map<String , Integer> map = new HashMap<>();

        for(String s : strs){
            char[] cArr = s.toCharArray();

            Arrays.sort(cArr);

            String sortChar = new String(cArr);

            if(!map.containsKey(sortChar)) {
                map.put(sortChar , list.size());
                list.add(new ArrayList<>());
            }
            int idx = map.get(sortChar);
            list.get(idx).add(s);
        }
        return list;
    }
}
