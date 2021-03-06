package com.aj;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = input.nextLine();

        System.out.println("Result: " + isPalindrome(word));
    }

    // method that checks palindrome of a string
    private static boolean isPalindrome(String word) {
        if (word.length() <= 1) return true;

        int stringLength = word.length();

        return (word.charAt(0) == word.charAt(stringLength - 1) && isPalindrome(word.substring(1, stringLength - 1)));
    }
}
