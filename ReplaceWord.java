// Program to replace a given word in string with another word
import java.util.Scanner;

class ReplaceWord {
    // Main Method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.nextLine();

        System.out.print("Enter a word to replace: ");
        String wordToReplace = input.next();

        System.out.print("Enter a word to replace with: ");
        String wordToReplaceWith = input.next();

        // Method to replace a given word in string with another word
        String result = replaceWord(str, wordToReplace, wordToReplaceWith);

        System.out.println("String after replacing word: " + result);

        input.close();
    }

    // Method to replace a given word in string with another word
    public static String replaceWord(String str, String wordToReplace, String wordToReplaceWith) {
        String[] words = str.split(" ");
        String result = "";
        for (String word : words) {
            if (word.equals(wordToReplace)) {
                result += wordToReplaceWith + " ";
            } else {
                result += word + " ";
            }
        }
        return result;
    }
}
// Sample Input ->
// Enter a string: Hello World
// Enter a word to replace: World
// Enter a word to replace with: Universe

// Sample Output ->
// String after replacing word: Hello Universe

// Sample Input ->
// Enter a string: Welcome to the world of programming
// Enter a word to replace: world
// Enter a word to replace with: universe

// Sample Output ->
// String after replacing word: Welcome to the universe of programming