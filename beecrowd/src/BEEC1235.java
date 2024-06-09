import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BEEC1235 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine().trim());
        for (int i = 0; i < N; i++) {
            String line = reader.readLine().trim();
            int len = line.length();
            String leftHalf = new StringBuilder(line.substring(0, len / 2)).reverse().toString();
            String rightHalf = new StringBuilder(line.substring(len / 2)).reverse().toString();
            System.out.println(leftHalf + rightHalf);
        }
    }
}
