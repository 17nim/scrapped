public class EvenArray {
    final static int size = 10;
    static int evenCount = 0;

    public static void main(String[] args) {
        int len = args.length;
        String[] list = new String[len];
        int[] convertedList = new int[len];

        if (len == 0) {
            System.out.println("Invalid input: Please enter at least one integer.");
            System.out.println("Usage: java EvenArray <integer_1> <integer_2> ...");
            System.exit(0);
        }

        for (int counter = 0; counter < len; counter++) {
            list[counter] = args[counter];
            convertedList[counter] = Integer.parseInt(list[counter]);

            if (counter < size && convertedList[counter] % 2 == 0) {
                evenCount++;
            }
        }

        if (evenCount == 0) {
            System.out.println("No even integer found.");
            System.exit(0);
        } else {
            System.out.println("Only even integers are:");
            for (int currentIndex = 0; currentIndex < convertedList.length; currentIndex++) {
                if (currentIndex < size && convertedList[currentIndex] % 2 == 0) {
                    System.out.print(convertedList[currentIndex] + " ");
                }
            }
        }
    }
}
