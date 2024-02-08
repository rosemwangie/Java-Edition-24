public class CharCodePoint {
    public static void main(String[] args) {
        String greeting = "Hello";

        // Using charAt to get code unit at position n
        char first = greeting.charAt(0);
        char last = greeting.charAt(4);

        System.out.println("Using charAt:");
        System.out.println("First character: " + first); // Should print 'H'
        System.out.println("Last character: " + last);   // Should print 'o'

//        The value 101 corresponds to a Unicode code point. In Unicode, each character is assigned a unique code point, which is a numerical
//        value. The code point 101 specifically corresponds to the Unicode character represented by the letter 'e'. So, in your example,
//        when you use the code greeting.codePointAt(index), it retrieves the Unicode code point at the specified index (in this case, index 1),
//        and the value 101 represents the letter 'e'.
        // Using offsetByCodePoints and codePointAt to get the ith code point
        int i = 1; // Example: get the second code point
        int index = greeting.offsetByCodePoints(0, i);
        int cp = greeting.codePointAt(index);

        System.out.println("\nUsing offsetByCodePoints and codePointAt:");
        System.out.println("Code point at index " + i + ": " + cp); // Should print the code point of the second character
    }
}
