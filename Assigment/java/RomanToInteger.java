package Assigment;

import java.util.HashMap;
import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args) {
        // Create a HashMap to map Roman numerals to their integer values
        HashMap<Character, Integer> romanToInteger = new HashMap<>();
        romanToInteger.put('I', 1);
        romanToInteger.put('V', 5);
        romanToInteger.put('X', 10);
        romanToInteger.put('L', 50);
        romanToInteger.put('C', 100);
        romanToInteger.put('D', 500);
        romanToInteger.put('M', 1000);

        // Read a Roman numeral from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman numeral: ");
        String romanNumeral = scanner.nextLine().toUpperCase();
        scanner.close();

        int result = 0;
        int prevValue = 0;

        // Traverse the Roman numeral from right to left and calculate the integer value
        for (int i = romanNumeral.length() - 1; i >= 0; i--) {
            int currentValue = romanToInteger.get(romanNumeral.charAt(i));
            if (currentValue < prevValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }
            prevValue = currentValue;
        }

        // Print the integer value
        System.out.println("The integer value of the Roman numeral " + romanNumeral + " is: " + result);
    }
}
