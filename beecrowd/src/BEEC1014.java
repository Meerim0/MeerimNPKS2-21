import java.util.Scanner;

public class BEEC1014{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        double y = scanner.nextDouble();
        double z = x/y;
        System.out.println(String.format("%.3f", z) + " km/l");
        scanner.close();
    }
}