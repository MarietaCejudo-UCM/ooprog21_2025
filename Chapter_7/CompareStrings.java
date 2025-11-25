import java.util.Scanner;

public class CompareStrings {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name > ");
        String name = input.nextLine();

        String predefinedName = "Carmen";

        if (name.equals(predefinedName)) {
            System.out.println(predefinedName + " equals " + name );
        } else {
            System.out.println(predefinedName + " does not equal " + name);
        }

        input.close();
    }
}
