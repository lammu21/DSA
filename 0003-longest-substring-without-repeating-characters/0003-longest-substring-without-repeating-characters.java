class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashMap<Character, Integer> mpp = new HashMap<Character, Integer>();

        int left = 0, right = 0;
        int n = s.length();
        int len = 0;
        while (right < n) {

            // checking key is already presented in map
            if (mpp.containsKey(s.charAt(right))) {

                // if present checking if is in current window, i.e., between left and right
                if (mpp.get(s.charAt(right)) >= left) {

                    // if it is within window update left right +1 position
                    left = mpp.get(s.charAt(right)) + 1;

                }

            }
            // if the current string window or substring length is greater than len updating it.
         
            len = Math.max(len, right - left + 1);
            // and storing rightTH letter of string at rightTH position in hashmap
            mpp.put(s.charAt(right), right);
            right++;
        }
        return len;

    }
}