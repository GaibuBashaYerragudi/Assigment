package Assigment;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PangramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();
        scanner.close();

        boolean isPangram = isPangram(input);

        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String input) {
        // Remove spaces and convert the input to lowercase
        input = input.replaceAll(" ", "").toLowerCase();

        // Use a Set to keep track of the unique characters in the input
        Set<Character> uniqueChars = new HashSet<>();

        // Iterate through the characters in the input and add them to the set
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                uniqueChars.add(c);
            }
        }

        // Check if the set contains all 26 letters of the alphabet
        return uniqueChars.size() == 26;
    }
}
