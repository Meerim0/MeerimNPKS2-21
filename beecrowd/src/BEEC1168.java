import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BEEC1168 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] leds = {6, 2, 5, 5, 4, 5, 6, 3, 7, 6};
        int N = Integer.parseInt(reader.readLine().trim());
        for (int i = 0; i < N; i++) {
            String number = reader.readLine().trim();
            int totalLeds = 0;
            for (char digit : number.toCharArray()) {
                totalLeds += leds[Character.getNumericValue(digit)];
            }
            System.out.println(totalLeds + " leds");
        }
    }
}
