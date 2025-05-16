class Solution {
    public int strStr(String haystack, String needle) {
       
       if (needle.isEmpty()) return 0; // per common convention
       return haystack.indexOf(needle);
    }
}
