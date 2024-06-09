import java.util.Scanner;

public class BEEC1019 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalSeconds = scanner.nextInt();
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;

        System.out.printf("%1d:%1d:%1d%n", hours, minutes, seconds);
        scanner.close();
    }
}