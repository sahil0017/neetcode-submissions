class Solution {
    public int lengthOfLongestSubstring(String s) {
        int length =0;
        int start =0;

        Set<Character> set = new HashSet<>();

        for (int end =0;end < s.length() ;end ++) {
            char ch = s.charAt(end);
            while (set.contains(ch)) {
                set.remove(s.charAt(start));
                start++;
            }

            set.add(ch);
            length = Math.max(length, end-start+1);
        }

        return length;
    }
}
