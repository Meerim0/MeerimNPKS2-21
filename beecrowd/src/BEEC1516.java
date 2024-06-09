import java.util.Scanner;

public class BEEC1516 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int N = scanner.nextInt();
            int M = scanner.nextInt();

            if (N == 0 && M == 0) {
                break;
            }
            scanner.nextLine();
            char[][] drawing = new char[N][M];
            for (int i = 0; i < N; i++) {
                drawing[i] = scanner.nextLine().toCharArray();
            }

            int A = scanner.nextInt();
            int B = scanner.nextInt();

            for (int i = 0; i < A; i++) {
                for (int j = 0; j < B; j++) {
                    System.out.print(drawing[i / (A / N)][j / (B / M)]);
                }
                System.out.println();
            }

            System.out.println();
        }

        scanner.close();
    }
}
