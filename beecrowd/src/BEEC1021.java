import java.util.Scanner;
import java.util.Locale;

public class BEEC1021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        double N = sc.nextDouble();
        sc.close();
        int notas[] = {100, 50, 20, 10, 5, 2};
        int moedas[] = {100, 50, 25, 10, 5, 1};
        int valor = (int) N;
        int centavos = (int) Math.round((N - valor) * 100);

        System.out.println("NOTAS:");
        for (int nota : notas) {
            int quantidade = valor / nota;
            System.out.printf("%d nota(s) de R$ %.2f%n", quantidade, (double) nota);
            valor %= nota;
        }

        System.out.println("MOEDAS:");
        centavos += valor * 100;
        for (int moeda : moedas) {
            int quantidade = centavos / moeda;
            System.out.printf("%d moeda(s) de R$ %.2f%n", quantidade, moeda / 100.0);
            centavos %= moeda;
        }
    }
}







