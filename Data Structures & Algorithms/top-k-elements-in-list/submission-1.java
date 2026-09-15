class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer>[] buckets = new List[nums.length + 1];
        int[] ans = new int[k];

        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int frequency = entry.getValue();
            int num = entry.getKey();

            if (buckets[frequency] == null) {
                buckets[frequency] = new ArrayList<>();
            }
            buckets[frequency].add(num);
        }
        int idx = 0;
        for(int i = buckets.length - 1; i>= 0 && idx < k; i--){
            if(buckets[i] != null){
                for(int num : buckets[i]){
                    if(idx < k){
                        ans[idx++] = num;
                    }
                }
            }
        }
        return ans;
    }
}
