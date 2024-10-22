class Solution {
    public int characterReplacement(String s, int k) {

        int start = 0, maxfreq = 0, maxlength = 0;
        int[] countFreq = new int[26];

        for (int end = 0; end < s.length(); end++) {
            countFreq[s.charAt(end) - 'A']++;
            maxfreq = Math.max(maxfreq, countFreq[s.charAt(end) - 'A']);

            if (end - start + 1 - maxfreq > k) {
                countFreq[s.charAt(start) - 'A']--;

                start++;
            }

            maxlength = Math.max(maxlength, end - start+1);
        }
        return maxlength;

    }
}