// Perform the operation to demonstrate IllegalArgumentException
import java.util.Scanner;

class IllegalArgumentExceptionDemo {
    // Method to generate IllegalArgumentException
    public static void generateException(String str) {
        if (str.length() < 2) {
            throw new IllegalArgumentException("String must have at least 2 characters!");
        }

        // Invalid substring indices (end < start)
        if (str.length() > 1) {
            throw new IllegalArgumentException("Invalid substring indices: start > end");
        }

        // Attempting invalid substring operation (this line will not be reached due to the throw above)
        String subString = str.substring(str.length(), 0);
        System.out.println("Substring: " + subString);
    }
    
    // Method to handle RuntimeException
    public static void handleException(String str) {
        try {
            generateException(str); // Call method that throws IllegalArgumentException
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Define a variable of type String and take user input
        System.out.print("Enter a string: ");
        String userInput = input.next();

        // Method to generate the Exception
        // generateException(userInput);

        // Method to handle the RuntimeException
        handleException(userInput);

        input.close();
    }

}
