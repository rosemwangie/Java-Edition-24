package codeExamples;

public class StringBuilderAction{
    public static void main(String[] args) {
        // Construct an empty StringBuilder
        StringBuilder builder = new StringBuilder();
//Use is to save memory
        // Add individual characters
        char ch = 'H';
        builder.append(ch);
        System.out.println("After appending '" + ch + "': " + builder.toString());

        // Add a string
        String str = "ello";
        builder.append(str);
        System.out.println("After appending \"" + str + "\": " + builder.toString());

        // Add more characters
        builder.append(' ');
        System.out.println("After appending a space: " + builder.toString());

        // Add another string
        String greeting = "World!";
        builder.append(greeting);
        System.out.println("After appending \"" + greeting + "\": " + builder.toString());

        // Convert StringBuilder to String
        String completedString = builder.toString();

        // Print the final string
        System.out.println("Completed String: " + completedString);
    }
}
