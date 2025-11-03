
import java.util.Scanner;
public class CharacterInfo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);  

        System.out.print("Enter char > ");
        char ch = input.next().charAt(0);

        System.out.println("\nThe character is " + ch );

        if (Character.isUpperCase(ch)) {
            System.out.println(ch + " is uppercase");
        } else {
            System.out.println(ch + " is not uppercase");
        }

        if (Character.isLowerCase(ch)) {
            System.out.println(ch + " is lowercase");
        } else {
            System.out.println(ch + " is not lowercase");
        }

        char lowerCaseCh = Character.toLowerCase(ch);
        System.out.println("After toLowerCase(), aChar is " + lowerCaseCh);

        char upperCaseCh = Character.toUpperCase(ch);
        System.out.println("After toUpperCase(), aChar is " + upperCaseCh);

        if (Character.isLetterOrDigit(ch)) {
            System.out.println(ch + " is a letter or digit");
        } else {
            System.out.println(ch + " is not a letter or digit");
        }

        if (Character.isWhitespace(ch)) {
            System.out.println(ch + " is whitespace");
        } else {
            System.out.println(ch + " is not whitespace");
        }

        input.close();
    }
}