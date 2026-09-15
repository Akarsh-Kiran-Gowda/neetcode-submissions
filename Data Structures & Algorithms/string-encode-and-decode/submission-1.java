class Solution {

    public String encode(List<String> strs) {
        StringBuilder encoded = new StringBuilder();

        for (String str : strs) {
            encoded.append(str.length()); // store length
            encoded.append('#');          // separator
            encoded.append(str);          // actual string
        }

        return encoded.toString();
    }

    public List<String> decode(String s) {
        ArrayList<String> result = new ArrayList<>();
        int i = 0;
        int n = s.length();

        while (i < n) {
            int len = 0;

            // Read length
            while (s.charAt(i) != '#') {
                len = len * 10 + (s.charAt(i) - '0');
                i++;
            }

            i++; // skip '#'

            // Read actual string
            String temp = s.substring(i, i + len);
            result.add(temp);

            i += len;
        }

        // Convert List → Array
        return result;
    }
}
