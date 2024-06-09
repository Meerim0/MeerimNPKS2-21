import java.util.Scanner;
import java.util.Arrays;

public class BEEC1045{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] sides = new double[3];
        sides[0] = sc.nextDouble();
        sides[1] = sc.nextDouble();
        sides[2] = sc.nextDouble();
        Arrays.sort(sides);
        double A = sides[2];
        double B = sides[1];
        double C = sides[0];


        if (A >= B + C) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            double A2 = A * A;
            double B2 = B * B;
            double C2 = C * C;
            if (A2 == B2 + C2) {
                System.out.println("TRIANGULO RETANGULO");
            }
            if (A2 > B2 + C2) {
                System.out.println("TRIANGULO OBTUSANGULO");
            }
            if (A2 < B2 + C2) {
                System.out.println("TRIANGULO ACUTANGULO");
            }
            if (A == B && B == C) {
                System.out.println("TRIANGULO EQUILATERO");
            } else if (A == B || B == C || A == C) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }
        sc.close();
    }
}
