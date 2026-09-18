class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] last = new int[256];
        int left = 0;
        int maxLen = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            left = Math.max(left, last[ch]);
            maxLen = Math.max(maxLen, i - left + 1);
            last[ch] = i + 1;
        }
       return maxLen;
    }
}