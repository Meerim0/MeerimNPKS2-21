import java.util.Scanner;

public class BEEC1238 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numCases = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numCases; i++) {
            String[] strings = scanner.nextLine().split(" ");
            String combined = combineStrings(strings[0], strings[1]);
            System.out.println(combined);
        }
        scanner.close();
    }

    public static String combineStrings(String s1, String s2) {
        StringBuilder result = new StringBuilder();
        int length = Math.min(s1.length(), s2.length());

        for (int i = 0; i < length; i++) {
            result.append(s1.charAt(i));
            result.append(s2.charAt(i));
        }

        if (s1.length() > s2.length()) {
            result.append(s1.substring(length));
        } else if (s2.length() > s1.length()) {
            result.append(s2.substring(length));
        }

        return result.toString();
    }
}
