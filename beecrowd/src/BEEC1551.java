import java.util.*;

public class BEEC1551 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < N; i++) {
            String line = scanner.nextLine().replaceAll("[, ]", "");
            Set<Character> uniqueChars = new HashSet<>();
            for (char c : line.toCharArray()) {
                uniqueChars.add(c);
            }

            if (uniqueChars.size() == 26) {
                System.out.println("frase completa");
            } else if (uniqueChars.size() >= 13) {
                System.out.println("frase quase completa");
            } else {
                System.out.println("frase mal elaborada");
            }
        }

        scanner.close();
    }
}
