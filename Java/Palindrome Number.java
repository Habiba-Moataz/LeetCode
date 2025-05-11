class Solution {
    public boolean isPalindrome(int x) {
        String xStr = String.valueOf(x);
        String str1, str2;
        int len = xStr.length();
        int end = len / 2;
        boolean palindrome = true;

        if (x < 0) {
            palindrome = false;
        } else if (x < 10) {
            palindrome = true;
        } else {
            if (len % 2 == 1) {
                str1 = xStr.substring(0, end);
                str2 = xStr.substring(end + 1);
            } else {
                str1 = xStr.substring(0, end);
                str2 = xStr.substring(end);
            }

            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) != str2.charAt(str2.length() - 1 - i)) {
                    palindrome = false;
                    break;
                }
            }
        }
        return palindrome;
    }
}
