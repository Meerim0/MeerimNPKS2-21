public class BEEC1237 {
    public static int longestCommonSubstring(String s1, String s2) {
        int[][] dp = new int[s1.length() + 1][s2.length() + 1];
        int maxLength = 0;

        for (int i = 1; i <= s1.length(); i++) {
            for (int j = 1; j <= s2.length(); j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    maxLength = Math.max(maxLength, dp[i][j]);
                } else {
                    dp[i][j] = 0;
                }
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(longestCommonSubstring("abcdef", "cdofhij"));
        System.out.println(longestCommonSubstring("TWO", "FOUR"));
        System.out.println(longestCommonSubstring("abracadabra", "open"));
    }
}
