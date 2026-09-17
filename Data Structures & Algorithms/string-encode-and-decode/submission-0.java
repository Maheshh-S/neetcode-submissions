class Solution {
    // Encode: len + '#' + content per string
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            sb.append(s.length()).append('#').append(s);
        }
        return sb.toString();
    }

    // Decode: find '#', parse len, take len chars
    public List<String> decode(String s) {
        List<String> res = new ArrayList<>();
        int i = 0, n = s.length();
        while (i < n) {
            int j = i;
            while (s.charAt(j) != '#') j++;
            int len = Integer.parseInt(s.substring(i, j));
            int from = j+1;
            int to = j+1+len;
            //Exclusion of to, eg :  means if 2 is 6 then it will only count 5. 
            res.add(s.substring(from, to));
            i = j + 1 + len;
        }
        return res;
    }
}