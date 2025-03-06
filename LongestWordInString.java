// Program to find the longest word present in the String
import java.util.Scanner;

class LongestWordInString {
    // Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.nextLine();

        // Method to find the longest word in a string
        String result = longestWord(str);

        System.out.println("Longest word in the string: " + result);

        input.close();
    }

    // Method to find the longest word in a string
    public static String longestWord(String str) {
        String[] words = str.split(" ");
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }
}
// Sample Input ->
// Enter a string: Hello World

// Sample Output ->
// Longest word in the string: Hello

// Sample Input ->
// Enter a string: Welcome to the world of programming

// Sample Output ->
// Longest word in the string: programming