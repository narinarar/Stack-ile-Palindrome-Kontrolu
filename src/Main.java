import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        // Bir cümlenin palindrome olup olmadığını bulma.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir cümle giriniz.");
        String cumle = scanner.nextLine();

        Stack<Character> stack = new Stack<Character>(); //Stack oluşturduk.

        for (int i = 0 ; i < cumle.length()/2 ; i++) {
            stack.push(cumle.charAt(i));
        }
        if (isPalindrome(cumle, stack)) {
            System.out.println("Bu cümle palindrome cümledir. ");
        }
        else {
            System.out.println("Bu cümle palindrome cümle değildir. ");
        }

    }
    //Cümle palindrome ise true değer , palindrome değilse false değer dönecek.
    public static boolean isPalindrome(String cumle, Stack<Character> stack) {
        for (int i = (cumle.length() / 2) + 1; i < cumle.length(); i++) {

            if (cumle.charAt(i) != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}
