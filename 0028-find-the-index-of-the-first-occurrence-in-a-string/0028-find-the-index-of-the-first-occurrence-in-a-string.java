class Solution {
    public int strStr(String haystack, String needle) {
        // Edge case: if needle is empty, return 0 (by convention)
        if (needle.isEmpty()) {
            return 0;
        }

        // Use the built-in indexOf method
        return haystack.indexOf(needle);
    }
}
