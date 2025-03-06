// Program to check if two strings are anagrams or not
import java.util.Scanner;
class AnagramStrings {
    // Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = input.nextLine();

        System.out.print("Enter second string: ");
        String str2 = input.nextLine();

        // Method to check if two strings are anagrams
        boolean result = areAnagrams(str1, str2);

        // Display result
        if (result) {
            System.out.println("The two strings are anagrams");
        } else {
            System.out.println("The two strings are not anagrams");
        }

        input.close();
    }

    // method to check if two strings are anagrams
    public static boolean areAnagrams(String s1, String s2) {
        // Check if lengths are equal
        if (s1.length() != s2.length()) {
            return false;
        }

        // Create frequency arrays for both texts (ASCII size: 256)
        int[] frequency1 = new int[256];
        int[] frequency2 = new int[256];

        // Count frequency of each character in both texts
        for (int i = 0; i < s1.length(); i++) {
            frequency1[s1.charAt(i)]++;
            frequency2[s2.charAt(i)]++;
        }

        // Compare the frequency arrays
        for (int i = 0; i < 256; i++) {
            if (frequency1[i] != frequency2[i]) {
                return false;
            }
        }
        return true;
    }
}
// Sample Input ->
// Enter first string: listen
// Enter second string: silent

// Sample Output ->
// The two strings are anagrams

// Sample Input ->
// Enter first string: hello
// Enter second string: world

// Sample Output ->
// The two strings are not anagrams