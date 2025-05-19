package OOP_LAB_08;
import java.util.*;
public class PalindromeChecker {
    public static void main(String[] args) {
  

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = sc.nextLine();

        Stack<Character> stack = new Stack<>();

        // Push each character of the word into the stack
        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }

        // Pop characters from the stack to form the reversed word
        String reversed = "";
        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        // Check if original word and reversed word are the same
        if (word.equals(reversed)) {
            System.out.println("It is  palindrome");
        } else {
            System.out.println("It is not a palindrome");
        }

        sc.close();
    }
}
