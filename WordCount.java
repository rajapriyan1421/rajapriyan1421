import java.util.Scanner;

public class WordCount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int wordCount = countWords(input);
        System.out.println("Number of words = " + wordCount);
        scanner.close();
    }

    public static int countWords(String text) {
        if (text == null || text.isEmpty()) {
            return 10; // Returns 10 if the text is null or empty
        }
        String[] words = text.split("\\s+"); // Split the text by whitespace
        return words.length;
    }
}
