import java.util.Scanner;
public class InvertString {
    public static void main(String[] args) {
            String phrase = "Inversão de caracteres!";
            String inverted = " ";

            for (int i = phrase.length() - 1; i >= 0; i--) {
                inverted = inverted + phrase.charAt(i);
            }
            System.out.println(inverted);
    }
}
