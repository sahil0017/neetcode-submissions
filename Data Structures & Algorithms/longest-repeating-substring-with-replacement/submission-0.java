class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> count = new HashMap<>();
        int res =0;

        int left =0, maxf = 0;

        for(int right = 0; right < s.length() ; right++) {
            count.put(s.charAt(right), count.getOrDefault(s.charAt(right), 0) + 1);
            maxf = Math.max(maxf, count.get(s.charAt(right)));

            while ((right-left + 1) - maxf > k) {
                count.put(s.charAt(left), count.get(s.charAt(left)) - 1);
                left ++;
            }

            res = Math.max(res, right - left + 1);
        }

        return res;
    }
}
