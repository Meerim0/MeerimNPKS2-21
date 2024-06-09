import java.util.Scanner;

public class BEEC1017{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int s = scanner.nextInt();
        double d = t * s;
        double result = d/ 12.0;

        System.out.printf("%.3f%n", result);
        scanner.close();
    }
}