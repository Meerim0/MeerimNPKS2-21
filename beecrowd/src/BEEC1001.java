
import java.util.Scanner;

public class BEEC1001 {
        public static void main(String[] args){
                Scanner in = new Scanner(System.in);
                System.out.print("введи А");
                int A =in.nextInt();
                System.out.print("Введи Б");
                int B = in.nextInt();
                int x = A + B;
                System.out.println(x);
                in.close();

        }
}