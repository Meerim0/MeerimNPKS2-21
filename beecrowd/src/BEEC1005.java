import java.util.Scanner;
import java.util.Locale;


public class BEEC1005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double media = (A * 3.5 + B * 7.5) / (3.5 + 7.5);
        System.out.printf("MEDIA = %.5f\n", media);
        scanner.close();
    }
}