// Program to generate and display the characters of a string using charAt method and toCharArray method
import java.util.Scanner;

class StringCharacters {
    // Method to store characters of a string in an array using charAt method
    public static char[] storeCharactersUsingCharAt(String s) {
        // Initialize an array to store the characters of the string
        char[] characters = new char[s.length()];

        // Store the characters of the string in the array using charAt method
        for (int i = 0; i < s.length(); i++) {
            characters[i] = s.charAt(i);
        }

        return characters;
    }

    // Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input for a string
        System.out.print("Enter a string: ");
        String s = input.next();

        // Store the characters of the string in an array using charAt method
        char[] characters = storeCharactersUsingCharAt(s);

        // Store the characters in an array using toCharArray method
        char[] charactersUsingToCharArray = s.toCharArray();

        // Display the result
        System.out.println("Characters of the string using charAt method:");
        for (char c : characters) {
            System.out.print(c + " ");
        }
        System.out.println();

        System.out.println("Characters of the string using toCharArray method:");
        for (char c : charactersUsingToCharArray) {
            System.out.print(c + " ");
        }
        System.out.println();

        // Compare if two arrays are equal or not
        if (characters.length != charactersUsingToCharArray.length) {
            System.out.println("The two arrays are not equal");
        } else {
            boolean isEqual = true;
            for (int i = 0; i < characters.length; i++) {
                if (characters[i] != charactersUsingToCharArray[i]) {
                    isEqual = false;
                    break;
                }
            }

            if (isEqual) {
                System.out.println("The two arrays are equal");
            } else {
                System.out.println("The two arrays are not equal");
            }
        }

        input.close();
    }
}
