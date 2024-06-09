import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        try {
            BigInteger bigInteger = new BigInteger("1511144845");
            BigInteger bigInteger2 = new BigInteger("2543");

            ArrayList<Integer> add = BigInteger.addBigInt(bigInteger, bigInteger2);
            System.out.println("Add: " + listToString(add));

            ArrayList<Integer> subtract = BigInteger.subtractBigInt(bigInteger, bigInteger2);
            System.out.println("Subtraction: " + listToString(subtract));

            ArrayList<Integer> multiply = BigInteger.multiplyBigInt(bigInteger, bigInteger2);
            System.out.println("Multiplication: " + listToString(multiply));

            ArrayList<Integer> divide = BigInteger.divideBigInt(bigInteger, bigInteger2);
            System.out.println("Division: " + listToString(divide));
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }


    public static String listToString(ArrayList<Integer> list) {
        StringBuilder sb = new StringBuilder();
        for (int num : list) {
            sb.append(num);
        }
        return sb.toString();
    }
}
