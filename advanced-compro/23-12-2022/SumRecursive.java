package saengnak.siraspon;

import java.util.Scanner;

public class SumRecursive {
    static int sum(int counter) {
        if (counter <= 0) {
            return 0;
        } else {
            return counter + sum(counter - 1);
        }
    }

    static Scanner userInput = new Scanner(System.in);
    static String inputMessage = "Enter a positive integer: ";

    public static void main(String[] args) {
        System.out.print(inputMessage);
        int value = userInput.nextInt();

        while (value <= 0 == false) {
            System.out.println("The sum recursive of " + value + " is " + sum(value) + ".");
            System.out.print(inputMessage);
            value = userInput.nextInt();
        }

        System.out.println("The sum recursive of " + value + " is " + sum(value) + ".");
        userInput.close();
    }
}
