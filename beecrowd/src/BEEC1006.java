import java.util.Scanner;
import java.util.Locale;


public class BEEC1006 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            scanner.useLocale(Locale.US);
            double A = scanner.nextDouble();
            double B = scanner.nextDouble();
            double C = scanner.nextDouble();
            double media = (A * 2 + B * 3 + C * 5) / (2 + 3 + 5);
            System.out.printf("MEDIA = %.1f\n", media);
            scanner.close();
        }
    }

