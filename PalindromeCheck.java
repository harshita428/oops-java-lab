package Com.Sample;

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Convert to lower case to ignore case sensitivity
        str = str.toLowerCase();

        // Check if palindrome
        boolean isPalindrome = true;
        int n = str.length();

        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        // Output
        if (isPalindrome) {
            System.out.println("The given string is a Palindrome.");
        } else {
            System.out.println("The given string is NOT a Palindrome.");
        }

        sc.close();
    }
}
