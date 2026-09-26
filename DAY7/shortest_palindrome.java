class Shortest_palindrome{
    public String shortestPalindrome(String s) {

        int i = 0;

        for (int j = s.length() - 1; j >= 0; j--) {

            if (s.charAt(i) == s.charAt(j)) {
                i++;
            }
        }

        if (i == s.length()) {
            return s;
        }

        String rem = s.substring(i);
        String rev = new StringBuilder(rem).reverse().toString();

        return rev + shortestPalindrome(s.substring(0, i)) + rem;
    }
}