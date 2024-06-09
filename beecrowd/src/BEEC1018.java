import java.util.Scanner;

public class BEEC1018 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] banknotes = {100, 50, 20, 10, 5, 2, 1};

        System.out.println(N);
        for (int i = 0; i < banknotes.length; i++) {
            int quantity = N / banknotes[i];
            N %= banknotes[i];
            System.out.println(quantity + " nota(s) de R$ " + banknotes[i] + ",00");
        }

        scanner.close();
    }
}
