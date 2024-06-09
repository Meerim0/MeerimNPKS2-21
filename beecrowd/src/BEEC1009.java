import java.util.Scanner;

public class BEEC1009 {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        String firstname = scanner.nextLine();
        double salary = scanner.nextDouble();
        double sales = scanner.nextDouble();

        double total = salary + (sales * 0.15);
        System.out.printf("TOTAL = R$ %.2f%n", total);
        scanner.close();

    }

}
