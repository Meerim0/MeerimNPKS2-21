import java.util.Scanner;

public class BEEC1046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int startTime = sc.nextInt();
        int endTime = sc.nextInt();
        int duration;


        if (startTime < endTime) {
            duration = endTime - startTime;
        } else {
            duration = 24 - startTime + endTime;
        }

        System.out.printf("O JOGO DUROU %d HORA(S)%n", duration);
        sc.close();
    }
}
