package String;

public class StringManipulation {
    public static void main(String[] args) {
        String inputString = "Hello, World!";

        // String length
        int length = inputString.length();
        System.out.println("String Length: " + length);

        // Convert to uppercase
        String uppercaseString = inputString.toUpperCase();
        System.out.println("Uppercase: " + uppercaseString);

        // Convert to lowercase
        String lowercaseString = inputString.toLowerCase();
        System.out.println("Lowercase: " + lowercaseString);

        // Check if a string contains a substring
        String substring = "World";
        boolean containsSubstring = inputString.contains(substring);
        System.out.println("Contains 'World': " + containsSubstring);

        // Extract a substring
        int startIndex = 7;
        int endIndex = 12;
        String extractedSubstring = inputString.substring(startIndex, endIndex);
        System.out.println("Extracted Substring: " + extractedSubstring);

        // Replace characters in the string
        String replacedString = inputString.replace('l', 'L');
        System.out.println("Replaced String: " + replacedString);

        // Trim leading and trailing whitespaces
        String stringWithSpaces = "   Trim Me!   ";
        String trimmedString = stringWithSpaces.trim();
        System.out.println("Trimmed String: " + trimmedString);

        // Split the string into an array of substrings
        String fruits = "apple,banana,orange";
        String[] fruitArray = fruits.split(",");
        System.out.println("Fruits:");
        for (String fruit : fruitArray) {
            System.out.println(fruit);
        }

        // Check if a string starts with a specific prefix
        String prefix = "Hello";
        boolean startsWithHello = inputString.startsWith(prefix);
        System.out.println("Starts with 'Hello': " + startsWithHello);

        // Check if a string ends with a specific suffix
        String suffix = "!";
        boolean endsWithExclamation = inputString.endsWith(suffix);
        System.out.println("Ends with '!': " + endsWithExclamation);
    }
}


/*import java.util.Scanner;

public class SentenceMetricsCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        scanner.close();

        int totalDigits = 0;
        int totalUppercaseLetters = 0;
        int totalLowercaseLetters = 0;
        int totalAlphabets = 0;
        int totalSpecialCharacters = 0;
        int totalVowels = 0;
        int totalWords = 0;

        for (char ch : sentence.toCharArray()) {
            if (Character.isDigit(ch)) {
                totalDigits++;
            } else if (Character.isUpperCase(ch)) {
                totalUppercaseLetters++;
                totalAlphabets++;
            } else if (Character.isLowerCase(ch)) {
                totalLowercaseLetters++;
                totalAlphabets++;
            } else if (Character.isWhitespace(ch)) {
                totalWords++;
            } else {
                totalSpecialCharacters++;
            }

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
                    || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                totalVowels++;
            }
        }

        // Add 1 to totalWords to account for the last word in the sentence (no space after it).
        totalWords++;

        System.out.println("Total number of digits: " + totalDigits);
        System.out.println("Total number of uppercase letters: " + totalUppercaseLetters);
        System.out.println("Total number of lowercase letters: " + totalLowercaseLetters);
        System.out.println("Total number of alphabets: " + totalAlphabets);
        System.out.println("Total number of special characters: " + totalSpecialCharacters);
        System.out.println("Total number of vowels: " + totalVowels);
        System.out.println("Total number of words: " + totalWords);
    }
}
*/