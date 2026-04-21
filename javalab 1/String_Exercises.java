package stringexercises;

import java.util.*;

public class String_Exercises {

    // Q1: Check if string is null or empty/whitespace
    public static boolean isNullOrEmpty(String str) {
        return (str == null || str.trim().isEmpty());
    }

    // Q2: Count occurrences of substring
    public static int countOccurrences(String mainStr, String subStr) {
        int count = 0;
        int index = 0;

        while ((index = mainStr.indexOf(subStr, index)) != -1) {
            count++;
            index += subStr.length();
        }
        return count;
    }

    // Q3: Reverse string
    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    // Q4: Check palindrome (ignore case & punctuation)
    public static boolean isPalindrome(String str) {
        String clean = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(clean).reverse().toString();
        return clean.equals(reversed);
    }

    // Q5: Remove whitespace
    public static String removeWhitespace(String str) {
        return str.replaceAll("\\s", "");
    }

    // Q6: Capitalize first letter of each word
    public static String capitalizeWords(String str) {
        String[] words = str.split("\\s+");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                result.append(Character.toUpperCase(word.charAt(0)))
                      .append(word.substring(1).toLowerCase())
                      .append(" ");
            }
        }
        return result.toString().trim();
    }

    // Q7: Truncate string with ellipsis
    public static String truncate(String str, int length) {
        if (str.length() <= length) {
            return str;
        }
        return str.substring(0, length) + "...";
    }

    // Q8: Check numeric string
    public static boolean isNumeric(String str) {
        return str.matches("\\d+");
    }

    // Q9: Generate random string
    public static String generateRandomString(int length) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random rand = new Random();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < length; i++) {
            sb.append(chars.charAt(rand.nextInt(chars.length())));
        }
        return sb.toString();
    }

    // Q10: Count words in string
    public static int countWords(String str) {
        if (str == null || str.trim().isEmpty()) {
            return 0;
        }
        String[] words = str.trim().split("\\s+");
        return words.length;
    }

    // Main method (Testing all functions)
    public static void main(String[] args) {

        System.out.println("Q1: isNullOrEmpty -> " + isNullOrEmpty("   "));

        System.out.println("Q2: countOccurrences -> " +
                countOccurrences("Java is Java and Java is powerful", "Java"));

        System.out.println("Q3: reverseString -> " +
                reverseString("Hello"));

        System.out.println("Q4: isPalindrome -> " +
                isPalindrome("A man, a plan, a canal: Panama"));

        System.out.println("Q5: removeWhitespace -> " +
                removeWhitespace("Hello World Java"));

        System.out.println("Q6: capitalizeWords -> " +
                capitalizeWords("hello world java"));

        System.out.println("Q7: truncate -> " +
                truncate("HelloWorldProgramming", 10));

        System.out.println("Q8: isNumeric -> " +
                isNumeric("12345"));

        System.out.println("Q9: generateRandomString -> " +
                generateRandomString(8));

        System.out.println("Q10: countWords -> " +
                countWords("Java is a powerful language"));
    }
}