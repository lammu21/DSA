class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashMap <Character, Integer> mpp =new HashMap<Character, Integer>();

        int left=0, right=0;
        int n =s.length();
        int len=0;
        while(right<n){
            if(mpp.containsKey(s.charAt(right))){
                if(mpp.get(s.charAt(right))>=left)
                {
                    left=mpp.get(s.charAt(right))+1;
                }

            }
            len=Math.max(len,right-left+1);
            mpp.put(s.charAt(right),right);
            right++;
        }
        return len;
        
    }
}