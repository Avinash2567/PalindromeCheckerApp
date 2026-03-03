import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;
class PalindromeCheckerApp{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        Deque<Character> deque = new ArrayDeque<>();

        // Add each character into deque
        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        boolean isPalindrome = true;

        // Compare from both ends
        while (deque.size() > 1) {

            char front = deque.removeFirst();
            char back = deque.removeLast();

            if (front != back) {
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