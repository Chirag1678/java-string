// Program to toggle character case, lowercase to uppercase and vice-versa
import java.util.Scanner;

class ToggleCharacterCase {
    // Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.nextLine();

        // Method to toggle character case
        String result = toggleCharacterCase(str);

        System.out.println("String after toggling character case: " + result);

        input.close();
    }

    // Method to toggle character case
    public static String toggleCharacterCase(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if((int) ch >=65 && (int) ch <= 90){
                result += (char) ((int) ch + 32);
            } else if((int) ch >= 97 && (int) ch <= 122){
                result += (char) ((int) ch - 32);
            } else {
                result += ch;
            }
        }
        return result;
    }
}
// Sample Input -> 
// Enter a string: Hello World

// Sample Output ->
// String after toggling character case: hELLO wORLD

// Sample Input ->
// Enter a string: Welcome to the world of programming

// Sample Output ->
// String after toggling character case: wELCOME TO THE WORLD OF PROGRAMMING