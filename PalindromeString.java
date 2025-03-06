// Program to check if a string is palindrome or not
import java.util.Scanner;

class PalindromeString {
    // Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userInput = input.nextLine();

        // Method to check if string is palindorme
        if(isPalindrome(userInput)){
            System.out.println("String is palindrome");
        }
        else{
            System.out.println("String is not a palindrome");
        }

        input.close();
    }

    // Method to check if a string is palindrome
    public static boolean isPalindrome(String s){
        int start = 0, end = s.length() - 1;
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
// Sample Input -> 
// Enter a string: "abbabba"

// Sample output -> 
// String is palindrome