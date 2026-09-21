class Solution {
    public boolean isPalindrome(String s) {

        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            // Step 1: Check if character is alphanumeric
            if (Character.isLetterOrDigit(c)) {
                // Step 2: Convert to lowercase and append
                sb.append(Character.toLowerCase(c));
            }
        }
        String cleaned = sb.toString();

        int left = 0;
        int right = cleaned.length() - 1;

        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
