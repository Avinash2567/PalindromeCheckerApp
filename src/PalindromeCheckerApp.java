import java.util.Scanner;
class PalindromeCheckerApp{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        boolean isPalindrome = true;
        int n = input.length();

        for (int i = 0; i < n / 2; i++) {
            if (input.charAt(i) != input.charAt(n - 1 - i)) {
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