import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;
class PalindromeCheckerApp{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Insert characters into both structures
        for (char c : input.toCharArray()) {
            queue.add(c);     // FIFO
            stack.push(c);    // LIFO
        }

        boolean isPalindrome = true;

        // Compare until queue becomes empty
        while (!queue.isEmpty()) {

            char fromQueue = queue.remove();  // front
            char fromStack = stack.pop();     // top

            if (fromQueue != fromStack) {
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