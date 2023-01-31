import java.util.Arrays;

public class MultiDimArray {

    static int[][] numbersArray = { { 1, 8, 7, 6 }, { 5, 3 }, { 3, 2, 6 } };

    public static void display(int[][] userArray) {
        for (int i = 0; i < userArray.length; i++) {
            for (int j = 0; j < userArray[i].length; j++) {
                System.out.print(userArray[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        display(numbersArray);
        Arrays.sort(numbersArray[0]);
        Arrays.sort(numbersArray[1]);
        Arrays.fill(numbersArray[2], 9); //ID: 653040462-9
        display(numbersArray);
    }
}