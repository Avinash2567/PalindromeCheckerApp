import java.util.Scanner;

public class PalindromeCheckerApp {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a string: ");
    String s = sc.nextLine();

    if (check(s, 0, s.length() - 1))
      System.out.println("Palindrome");
    else
      System.out.println("Not Palindrome");

    sc.close();
  }

  static boolean check(String s, int start, int end) {

    if (start >= end)
      return true;

    if (s.charAt(start) != s.charAt(end))
      return false;

    return check(s, start + 1, end - 1);
  }
}