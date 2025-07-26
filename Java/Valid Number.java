class Solution {
    public boolean isNumber(String s) {
        String validChars = "1234567890+-eE.";
        int plus = 0, minus = 0, e = 0, numbers = 0, dot = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            char nextChar = i + 1 < s.length() ? s.charAt(i + 1) : '\0';
            char previousChar = i - 1 >= 0 ? s.charAt(i - 1) : '\0';

            if (validChars.indexOf(ch) == -1) {
                return false;
            } else if (ch == '-') {
                if ((e == 0 && i != 0) || (i == s.length() - 1) ||
                        (e == 1 && (previousChar != 'e' && previousChar != 'E'))) {
                    return false;
                }
                minus++;
            } else if (ch == '+') {
                if ((e == 0 && i != 0) || (i == s.length() - 1) ||
                        (e == 1 && (previousChar != 'e' && previousChar != 'E'))) {
                    return false;
                }
                plus++;
            } else if (ch == 'e' || ch == 'E') {
                if (i == 0 || i == s.length() - 1 || numbers == 0 || e > 0) {
                    return false;
                }
                if (nextChar == '+' || nextChar == '-') {
                    if (i + 2 >= s.length() || !Character.isDigit(s.charAt(i + 2))) {
                        return false;
                    }
                } else if (!Character.isDigit(nextChar)) {
                    return false;
                }
                e++;
            } else if (ch == '.') {
                if (e > 0 || dot == 1) {
                    return false;
                }
                dot++;
            } else {
                numbers++;
            }
        }

        if (minus > 0 && plus > 0 && e == 0) {
            return false;
        } else if (dot > 0 && numbers == 0) {
            return false;
        } else {
            return true;
        }
    }
}
