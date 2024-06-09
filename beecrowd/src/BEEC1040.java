import java.util.Locale;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Locale;

public class BEEC1040{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        DecimalFormat df = new DecimalFormat("0.0");
        double N1 = sc.nextDouble();
        double N2 = sc.nextDouble();
        double N3 = sc.nextDouble();
        double N4 = sc.nextDouble();
        double average = (N1 * 2 + N2 * 3 + N3 * 4 + N4) / 10.0;


        System.out.println("Media: " + df.format(average));


        if (average >= 7.0) {
            System.out.println("Aluno aprovado.");
        } else if (average < 5.0) {
            System.out.println("Aluno reprovado.");
        } else {
            System.out.println("Aluno em exame.");
            double examScore = sc.nextDouble();
            System.out.println("Nota do exame: " + df.format(examScore));
            double finalAverage = (average + examScore) / 2.0;
            if (finalAverage >= 5.0) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }
            System.out.println("Media final: " + df.format(finalAverage));
        }
        sc.close();
    }
}
