// Program to generate substring from a string using charAt method and substring method
import java.util.Scanner;

class CreateSubstring {
    // Method to generate substring from a string using charAt method
    public static String generateSubString(String s, int start, int end) {
        // Check if the start and end index are valid
        if (start < 0 || end > s.length() || start > end) {
            return "Invalid index";
        }

        // Initialize an empty string to store the substring
        String subString = "";

        // Generate the substring using charAt method
        for (int i = start; i < end; i++) {
            subString += s.charAt(i);
        }

        return subString;
    }

    // Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input for a string
        System.out.print("Enter a string: ");
        String s = input.next();

        // Take user input for the start and end index of the substring
        System.out.print("Enter the start index: ");
        int start = input.nextInt();

        System.out.print("Enter the end index: ");
        int end = input.nextInt();

        // Generate the substring using charAt method
        String subString = generateSubString(s, start, end);

        // Print the generated substring
        System.out.println("The substring is: " + subString);

        // Compare if the generate substring is equal to the substring genrated using substrig method
        if (subString.equals(s.substring(start, end))) {
            System.out.println("The substrings are equal by both methods");
        } else {
            System.out.println("The substrings are not equal by both methods");
        }

        input.close();
    }
}
