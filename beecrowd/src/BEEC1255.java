import java.util.*;

public class BEEC1255 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < N; i++) {
            String line = scanner.nextLine().toLowerCase();
            Map<Character, Integer> frequencyMap = new HashMap<>();

            for (char c : line.toCharArray()) {
                if (Character.isLetter(c)) {
                    frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
                }
            }
            int maxFrequency = Collections.max(frequencyMap.values());
            List<Character> maxLetters = new ArrayList<>();

            for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
                if (entry.getValue() == maxFrequency) {
                    maxLetters.add(entry.getKey());
                }
            }
            Collections.sort(maxLetters);
            for (char c : maxLetters) {
                System.out.print(c);
            }
            System.out.println();
        }

        scanner.close();
    }
}
