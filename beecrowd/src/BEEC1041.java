import java.util.Scanner;
import java.util.Locale;

public class BEEC1041 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        double x = sc.nextDouble();
        double y = sc.nextDouble();


        if (x == 0 && y == 0) {
            System.out.println("Origem");
        } else if (x == 0) {
            System.out.println("Eixo Y");
        } else if (y == 0) {
            System.out.println("Eixo X");
        } else if (x > 0 && y > 0) {
            System.out.println("Q1");
        } else if (x < 0 && y > 0) {
            System.out.println("Q2");
        } else if (x < 0 && y < 0) {
            System.out.println("Q3");
        } else if (x > 0 && y < 0) {
            System.out.println("Q4");
        }
        sc.close();
    }
}
