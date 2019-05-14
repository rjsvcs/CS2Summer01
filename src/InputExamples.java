import java.util.Scanner;

public class InputExamples {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter some text: ");

        String line = scanner.nextLine();

        char[] chars = line.toCharArray();
        for(char c : chars) {
            System.out.println(c);
        }


    }
}
