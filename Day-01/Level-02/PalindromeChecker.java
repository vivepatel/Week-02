import java.util.Scanner;

public class PalindromeChecker {
    private String text;

    // Constructor to initialize the text attribute
    public PalindromeChecker(String text) {
        this.text = text;
    }

    // Method to check if the text is a palindrome
    public boolean isPalindrome() {
        if (text == null || text.isEmpty()) {
            return false; // Null or empty string cannot be a palindrome
        }

        // Normalize the string: remove non-alphanumeric characters and convert to lowercase
        String normalizedText = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Check if the normalized text is the same when reversed
        int left = 0, right = normalizedText.length() - 1;
        while (left < right) {
            if (normalizedText.charAt(left) != normalizedText.charAt(right)) {
                return false; // Not a palindrome
            }
            left++;
            right--;
        }

        return true; // It is a palindrome
    }

    // Method to display the result
    public void displayResult() {
        if (isPalindrome()) {
            System.out.println("\"" + text + "\" is a palindrome.");
        } else {
            System.out.println("\"" + text + "\" is not a palindrome.");
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check if it is a palindrome: ");
        String input = scanner.nextLine();

        PalindromeChecker checker = new PalindromeChecker(input);
        checker.displayResult();

        scanner.close();
    }
}