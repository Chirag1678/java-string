// Program to reverse a string without any in built function/method
import java.util.Scanner;

class ReverseString {
    // Method to calculate length of string without length method
    public static int stringLength(String s) {
        int count = 0;
        try {
            while(s.charAt(count)!= '\0'){
                count++;
            }
        } catch (Exception e) {
            // Caught index out of bound, count is the length
        }
        return count;
    }

    // Method to reverse a string
    public static String reverse(String s) {
        if(s.length() < 2) return s;

        int length = stringLength(s);

        String reversedString = "";
        for(int i = length - 1; i>=0; i--) {
            char ch = s.charAt(i);

            reversedString+=ch;
        }

        return reversedString;
    }

    // Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userInput = input.nextLine();

        // Method to reverse the string
        String reversedString = reverse(userInput);

        System.out.print("Reversed String is: "+ reversedString);

        input.close();
    }
}
