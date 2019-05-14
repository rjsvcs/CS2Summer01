import java.util.Scanner;

/**
 * Solution to the Hello, You! coding activity.
 */
public class HelloYou {
    /**
     * Prompts the user to enter their name, then prints a customized hello
     * message.
     *
     * @param args Not used.
     */
    public static void main(String[] args) {
        // make a scanner to read from standard input
        Scanner scanner = new Scanner(System.in);

        //prompt the user to enter their name
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        // print a hello message
        System.out.println("Hello, " + name);
    }
}
