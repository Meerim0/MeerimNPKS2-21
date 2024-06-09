import java.util.Scanner;

public class BEEC1020 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ageInDays = scanner.nextInt();
        int years = ageInDays / 365;
        int months = (ageInDays % 365) / 30;
        int days = (ageInDays % 365) % 30;
        System.out.printf("%d ano(s)%n", years);
        System.out.printf("%d mes(es)%n", months);
        System.out.printf("%d dia(s)%n", days);

        scanner.close();
    }
}