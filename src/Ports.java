/**
 * Solutions to the various Ports coding activities.
 */
public class Ports {
    /**
     * Computes and returns the factorial of the specified number.
     *
     * @param n The number for which factorial should be computed.
     * @return The factorial of n.
     */
    public static int factorial(int n) {
        if(n == 0) {        // first base case
            return 1;
        } else if(n == 1) { // second base case
            return 1;
        } else {            // recursive case
            return n * factorial(n-1);
        }
    }

    /**
     * Computes and returns the equivalent human age of a dog that is the
     * specified age.
     *
     * @param age The age of the dog.
     * @return The equivalent human age.
     */
    public static int dogYears(int age) {
        int dogYears = 0;
        while(age > 2) {
            dogYears += 5;
            age -= 1;
        }

        if(age == 2) {
            dogYears += 24;
        } else {
            dogYears += 15;
        }

        return dogYears;
    }

    /**
     * Prints all of the values in the specified integer array on the same
     * line separated by spaces.
     *
     * @param values The array of values to print.
     */
    public static void arrayPrinter(int[] values) {
        for(int value : values) {
            // use System.out.print (not println) to print on the same line
            System.out.print(value + " ");
        }
        // add a carriage return at the end
        System.out.println();
    }

    /**
     * Creates and returns an integer array of size n such that the value at
     * each index k is the sum of the natural numbers from 0 to k.
     *
     * @param n The size of the array to be created and returned.
     * @return The array.
     */
    public static int[] sumOfNaturalNumbers(int n) {
        // create an integer array of size n
        int[] sums = new int[n];

        // create an accumulator
        int sum = 0;

        // set the value at each index k to the sum of the
        // natural numbers from 0 to k
        for(int k=0; k<sums.length; k++) {
            sum = sum + k;
            sums[k] = sum;
        }
        return sums;
    }

    public static void main(String[] args) {
        System.out.println("factorial(10) = " + factorial(10));

        System.out.println("dogYears(13) = " + dogYears(13));

        int[] values = new int[10];
        values[0] = 2;
        values[1] = 3;
        values[2] = 5;
        values[3] = 7;
        values[4] = 11;
        values[5] = 13;
        values[6] = 17;
        values[7] = 19;
        values[8] = 23;
        values[9] = 29;
        arrayPrinter(values);

        int[] sums = sumOfNaturalNumbers(20);
        for(int sum : sums) {
            System.out.print(sum + " ");
        }
    }
}
