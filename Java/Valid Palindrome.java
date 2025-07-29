class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();
        for (int i = 0 ;i<s.length()/2;i++){
            char c = s.charAt(i);
            char x = s.charAt(s.length()-1-i);
            if (c!=x){
                return false;
            }
        }
        return true;
    }
}
