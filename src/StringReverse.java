import java.util.Scanner;

public class StringReverse {
    private static final String myInput = "Wright some text:";
    private static final String myOutput = "Reversed the text: ";

    public static void main(String[] args) {
         Anagram anagram = new Anagram(); String text = readText();
        String reversedText = anagram.reverseText(text);
        System.out.println(myOutput + reversedText);
     }

    public static String readText() {
        Scanner in = new Scanner(System.in);
        System.out.println(myInput);
            return in.nextLine();
    }
}

