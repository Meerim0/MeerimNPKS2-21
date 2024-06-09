import java.util.Scanner;

public class BEEC1016{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = x*2;
        System.out.printf("%d minutos%n", y);
        scanner.close();
    }
}