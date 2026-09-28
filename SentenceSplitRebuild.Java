import java.util.Scanner;

public class SentenceSplitRebuild {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        // Split sentence into words
        String[] words = sentence.split(" ");

        // Rebuild sentence in new format
        StringBuilder newSentence = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            newSentence.append(words[i].toUpperCase());

            if (i < words.length - 1) {
                newSentence.append("-");
            }
        }

        System.out.println("Original Sentence: " + sentence);
        System.out.println("New Format: " + newSentence);

        sc.close();
    }
}
