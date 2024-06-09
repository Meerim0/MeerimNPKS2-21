import java.util.Scanner;

public class BEEC1239 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String result = translateShortcuts(line);
            System.out.println(result);
        }

        scanner.close();
    }

    public static String translateShortcuts(String line) {
        StringBuilder result = new StringBuilder();
        boolean inItalic = false;
        boolean inBold = false;

        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);

            if (c == '_') {
                if (inItalic) {
                    result.append("</i>");
                    inItalic = false;
                } else {
                    result.append("<i>");
                    inItalic = true;
                }
            } else if (c == '*') {
                if (inBold) {
                    result.append("</b>");
                    inBold = false;
                } else {
                    result.append("<b>");
                    inBold = true;
                }
            } else {
                result.append(c);
            }
        }

        if (inItalic) {
            result.append("</i>");
        }
        if (inBold) {
            result.append("</b>");
        }

        return result.toString();
    }
}
