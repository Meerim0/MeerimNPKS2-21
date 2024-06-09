import java.io.IOException;
import java.util.Scanner;

public class BEEC1004 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int prod = A * B;
        System.out.printf("PROD = %d\n", prod);
        scanner.close();
    }

}
