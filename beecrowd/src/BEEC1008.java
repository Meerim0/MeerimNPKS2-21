import java.util.Scanner;
import java.util.Locale;

public class BEEC1008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        int number = scanner.nextInt();
        int hours = scanner.nextInt();
        double rate = scanner.nextDouble();
        double salary = hours * rate;

        System.out.printf("NUMBER = %d\n", number);
        System.out.printf("SALARY = U$ %.2f\n", salary);
        scanner.close();
    }

}
