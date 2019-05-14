public class P2JExamples {

    public static void variables() {

        int age = 44;

        boolean checker = false;

        String hello = "Hello!";

        System.out.println(age);
        System.out.println(checker);
        System.out.println(hello);
    }

    public static void conditionals() {

        boolean value = true;
        int x = 5;
        int y =7;

        if(x == y) {
            System.out.println("x is equal to y");
        } else if( x < y) {
            System.out.println("x is smaller than y");
        } else {
            System.out.println("x is larger than y");
        }

    }

    public static void loops(String[] args) {

        for(String arg : args) {
            System.out.println(arg);
        }

        int counter = 0;
        while(counter < args.length) {
            System.out.println(args[counter]);
            counter++; // counter = counter + 1
        }

        for(int i=0; i<args.length; i++) {
            System.out.println(args[i]);
        }

    }

    public static void main(String[] args) {

        variables();

        conditionals();

        loops(args);

    }


}
