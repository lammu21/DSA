class Solution {
    public int characterReplacement(String s, int k) {
        
         int[] charCount = new int[26];
        int maxCount= 0;
        int start = 0;
        int end = 0;

        for (end = 0; end < s.length(); end++) {
            charCount[s.charAt(end) - 'A']++;
            maxCount = Math.max(maxCount, charCount[s.charAt(end) - 'A']);

            if (end - start + 1 - maxCount > k) {
                charCount[s.charAt(start) - 'A']--;
                start++;
            }
        }

        return end - start;
    }
}