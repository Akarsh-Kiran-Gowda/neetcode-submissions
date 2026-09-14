class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) return new ArrayList<>();

        Map<String, List<String>> map = new HashMap();
        for(String s : strs){
             // Count frequencies of each character and storing it in an integer array
            int[] counts = new int[26];  // by default all values are initialized to zero
            for (char c : s.toCharArray()) {
                counts[c - 'a']++;  // Increment the value at the given position
            }

            // Build a unique key string, e.g., "#1#0#2..." 
            StringBuilder sb = new StringBuilder();
            for (int count : counts) {
                sb.append('#').append(count);
            }
            String key = sb.toString();

            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
