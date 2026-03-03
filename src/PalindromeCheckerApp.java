import java.util.Scanner;
import java.util.Stack;
class PalindromeCheckerApp{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        Stack<Character> stack = new Stack<>();

        // Push each character into stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        boolean isPalindrome = true;

        // Compare original string with popped characters
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("It is a Palindrome.");
        } else {
            System.out.println("It is NOT a Palindrome.");
        }

        sc.close();







    }
}