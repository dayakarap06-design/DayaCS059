package stringdemo;

import java.util.*;

public class StringOperationsDemo {
    public static void main(String[] args) {

        // 1. String Creation and Basic Operations
        System.out.println("=== String Creation and Basic Operations ===");
        String str1 = "Hello";
        String str2 = new String("World");
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        // 2. Length and Character Access
        System.out.println("\n=== Length and Character Access ===");
        System.out.println("Length of str1: " + str1.length());
        System.out.println("Character at index 1 in str1: " + str1.charAt(1));

        // 3. String Comparison
        System.out.println("\n=== String Comparison ===");
        String s1 = "Java";
        String s2 = "java";
        System.out.println("Equals: " + s1.equals(s2));
        System.out.println("Equals Ignore Case: " + s1.equalsIgnoreCase(s2));

        // 4. String Searching
        System.out.println("\n=== String Searching ===");
        String searchStr = "Welcome to Java Programming";
        System.out.println("Index of 'Java': " + searchStr.indexOf("Java"));
        System.out.println("Contains 'to': " + searchStr.contains("to"));

        // 5. Substring Operations
        System.out.println("\n=== Substring Operations ===");
        String sub = searchStr.substring(11, 15);
        System.out.println("Substring (11,15): " + sub);

        // 6. String Modification
        System.out.println("\n=== String Modification ===");
        String mod = searchStr.replace("Java", "Python");
        System.out.println("After Replace: " + mod);

        // 7. Whitespace Handling
        System.out.println("\n=== Whitespace Handling ===");
        String ws = "   Hello World   ";
        System.out.println("Before Trim: '" + ws + "'");
        System.out.println("After Trim: '" + ws.trim() + "'");

        // 8. String Concatenation
        System.out.println("\n=== String Concatenation ===");
        String concat = str1 + " " + str2;
        System.out.println("Concatenated String: " + concat);

        // 9. String Splitting
        System.out.println("\n=== String Splitting ===");
        String fruits = "Apple,Banana,Orange";
        String[] arr = fruits.split(",");
        System.out.println("Splitted Strings:");
        for (String f : arr) {
            System.out.println(f);
        }

        // 10. StringBuilder Demo
        System.out.println("\n=== StringBuilder Demo ===");
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" Java");
        sb.insert(5, " World");
        sb.replace(0, 5, "Hi");
        System.out.println("StringBuilder Result: " + sb);

        // 11. String Formatting
        System.out.println("\n=== String Formatting ===");
        int age = 20;
        String formatted = String.format("My name is %s and I am %d years old", "Dayakara", age);
        System.out.println(formatted);

        // 12. Email Validation
        System.out.println("\n=== Email Validation ===");
        String email = "example@gmail.com";

        if (email.contains("@") &&
            email.startsWith("example") &&
            email.endsWith(".com")) {
            System.out.println("Valid Email");
        } else {
            System.out.println("Invalid Email");
        }
    }
}