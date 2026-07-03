class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";

        String ref = strs[0]; // use first string as reference

        for (int i = 0; i < ref.length(); i++) {
            char c = ref.charAt(i);
            for (int j = 1; j < strs.length; j++) {
                // mismatch OR we've gone past strs[j]'s length
                if (i >= strs[j].length() || strs[j].charAt(i) != c) {
                    return ref.substring(0, i);
                }
            }
        }

        return ref; // ref itself is the common prefix
    }
}