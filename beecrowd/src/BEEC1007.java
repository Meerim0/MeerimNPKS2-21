import java.util.Scanner;

public class BEEC1007{
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();
        int diff = (A * B - C * D);
        System.out.printf("DIFERENCA = %d\n",diff);
        scanner.close();
    }
}


