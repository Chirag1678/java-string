// Program to count number of Vowels and Consonants in a String
import java.util.Scanner;

class CountVowelsAndConsonants {
    // Method to count Vowels and Consonants
    public static int[] countVowelsAndConsonants(String str) {
        int vowels = 0, consonants = 0;
        
        // Convert the string to lower case, and trim whitespaces
        str = str.toLowerCase().trim();
        
        try {
            // Loop through the string
            for (int i = 0; i <= str.length(); i++) { // Delibrately trying to generate an exception
                // Get the character at the current index
                char ch = str.charAt(i);

                // Check if the character is a letter
                if (Character.isLetter(ch)) {
                    // Check if the character is a vowel
                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                        // Increment the count of vowels
                        vowels++;
                    } else {
                        // Increment the count of consonants
                        consonants++;
                    }
                }
            }
        } catch (IndexOutOfBoundsException e) {
            // Index out of bounds exception occur, return the vowel count and consonants count
        }
        return new int[]{vowels, consonants};
    }

    // Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userInput = input.nextLine();

        // Method to count the vowels and consonants
        int[] counts = countVowelsAndConsonants(userInput);

        // Display the results
        System.out.println("Number of vowels: "+ counts[0]);
        System.out.println("Number of consonants: "+ counts[1]);

        input.close();
    }
}
