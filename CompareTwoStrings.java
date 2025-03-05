// Program to compare two strings with charAt method and equals method
import java.util.Scanner;

class CompareTwoStrings {
    public static boolean compareUsingcharAt(String str1, String str2) {
        // Check if the length of the two strings are equal
        if (str1.length() != str2.length()) {
            return false;
        }

        // Compare each character of the two strings
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input for two Strings
        System.out.print("Enter first string: ");
        String str1 = input.next();

        System.out.print("Enter second string: ");
        String str2 = input.next();

        // Compare the two strings using charAt method
        if (compareUsingcharAt(str1, str2)) {
            System.out.println("The two strings are equal");
        } else {
            System.out.println("The two strings are not equal");
        }

        // Compare the two strings using equals method and check if the reult is same as the charAt method
        if (str1.equals(str2) == compareUsingcharAt(str1, str2)) {
            System.out.println("[Logical Check]: The two strings are equal");
        } else {
            System.out.println("[Logical Check]: The two strings are not equal");
        }

        input.close();
    }   
}