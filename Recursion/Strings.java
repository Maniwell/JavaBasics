package Recursion;

import java.util.Scanner;
public class Strings {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter string tobe reversed: ");
        String input = in.nextLine();
        boolean same = isPalindrome(input);

        if (same == true){
            System.out.println("The provided string is a plaindrome!");
        }
        else {
            String rev = reverseString(input);
            System.out.println(rev);
        }

    }

    public static boolean isPalindrome(String input) {
        if (input.length() == 0 || input.length() == 1){
            return true;
        }

        if (input.charAt(0) == input.charAt(input.length() - 1)) {
            return isPalindrome(input.substring(1, input.length() - 1));
        }

        return false;
    }

    public static String reverseString(String input) {
        if (input.equals("")) {
            return "";
        }

        return reverseString(input.substring(1)) + input.charAt(0);
    }
}
