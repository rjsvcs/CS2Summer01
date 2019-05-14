public class Example {
    public static void main(String[] args) {
        System.out.println("Hi there!");

        if(args.length == 0) {
            System.out.println("No command line parameters.");
        } else {
            System.out.println("There are " + args.length + " parameters.");
            for(String arg : args) {
                System.out.println(arg);
            }
        }
    }
}