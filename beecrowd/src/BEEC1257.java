import java.util.Scanner;

public class BEEC1257 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        scanner.nextLine();

        for (int t = 0; t < T; t++) {
            int L = scanner.nextInt();
            scanner.nextLine();

            int hash = 0;
            for (int i = 0; i < L; i++) {
                String line = scanner.nextLine();
                for (int j = 0; j < line.length(); j++) {
                    char c = line.charAt(j);
                    int alphabetPosition = c - 'A';
                    hash += alphabetPosition + i + j;
                }
            }

            System.out.println(hash);
        }

        scanner.close();
    }
}
