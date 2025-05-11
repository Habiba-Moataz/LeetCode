class Solution {
    public boolean isValid(String s) {
        int len;
        do {
            len = s.length();
            s = s.replace("()", "")
                 .replace("{}", "")
                 .replace("[]", "");
        } 
        while (s.length() != len);
        return s.isEmpty();
    }
}
