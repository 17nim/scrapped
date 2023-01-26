package saengnak.siraspon.exercises;

public class OddEvenChecker {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("java OddEvenChecker <number>");
            System.exit(0);
        }

        int number = Integer.parseInt(args[0]);

        if (number % 2 != 0) {
            System.out.println(number + " is an odd number.");  
        } else if (number % 2 == 0) {
            System.out.println(number + " is an even number.");
        } else {
            System.exit(0);
        }
    }
}