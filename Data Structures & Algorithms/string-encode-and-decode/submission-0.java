class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<strs.size() ;i++) {
            sb.append(strs.get(i).length())
              .append("#")
              .append(strs.get(i));
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> decoder = new ArrayList<>();
        int currentIdx = 0;

        while (currentIdx < str.length()) {
            int delimeterIdx = str.indexOf("#", currentIdx); // 2
            int stringLength = Integer.parseInt(str.substring(currentIdx, delimeterIdx));
            int stringStartIdx = delimeterIdx + 1;
            int stringEndIdx = stringStartIdx + stringLength;

            decoder.add(str.substring(stringStartIdx, stringEndIdx));
            currentIdx = stringEndIdx;
        }

        return decoder;
    }
}
