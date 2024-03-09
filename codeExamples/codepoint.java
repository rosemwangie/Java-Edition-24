package codeExamples;

public class codepoint {
    public static void main(String[] args){
        //CODE POINTS and CODE UNITS
        // Count of chars in a word/phrase == string
    // The length method is used
        String greetings = "Hi there";
        int length = greetings.length();
        System.out.println("The length in this is: " + length);
    //Using Code point to get the number of codepoints
        int cpCount = greetings.codePointCount(0, greetings.length());
        System.out.println("The codepoint is : " + cpCount);

    }
}
