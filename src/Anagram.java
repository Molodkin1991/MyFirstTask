import java.util.Arrays;
import java.util.stream.Collectors;

public class Anagram {
    private static final String delimited = " ";

    public String reverseText(String text) {
String[] words = text.split(delimited);
return Arrays.stream(words).map(this::reverseWord).collect(Collectors.joining(delimited));
 }

    public String reverseWord(String word) {
        char[] wordCharacters = word.toCharArray();
        for (int i = 0, j = wordCharacters.length - 1; i < j; ) {
        if (!Character.isAlphabetic(wordCharacters[i]))
                i++;
        else if (!Character.isAlphabetic(wordCharacters[j]))
            j--;
        else {
            char current = wordCharacters[i];
            wordCharacters[i] = wordCharacters[j];
            wordCharacters[j] = current;
            i++;
            j--;
        }
    }
        return String.valueOf(wordCharacters);
     }
}
