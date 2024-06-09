import java.util.Scanner;

public class BEEC1367 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int N = scanner.nextInt();

            if (N == 0) {
                break;
            }

            int score = 0;
            int penalty = 0;
            boolean[] correct = new boolean[26];
            int[] time = new int[26];

            for (int i = 0; i < N; i++) {
                String problem = scanner.next();
                int t = scanner.nextInt();
                String verdict = scanner.next();

                int index = problem.charAt(0) - 'A';
                if (!correct[index]) {
                    if (verdict.equals("correct")) {
                        correct[index] = true;
                        score++;
                        time[index] = t + penalty;
                    } else {
                        penalty += 20;
                    }
                }
            }

            System.out.println(score + " " + (score == 0 ? 0 : time[0]));
        }

        scanner.close();
    }
}
