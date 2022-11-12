import java.util.*;


public class ImageProcessing_9 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int cases = Integer.parseInt(input.nextLine());

        for(int i = 0; i < cases; i++) {

            String[] columsRowsString = input.nextLine().split(" +");
            int rows = Integer.parseInt(columsRowsString[0]);
            int colums = Integer.parseInt(columsRowsString[1]);

            int[][] matrix = new int[rows][colums];

            for (int j = 0; j < rows; j++) {
                String[] rowString = input.nextLine().split(" +");
                for (int k = 0; k < colums; k++) {
                    matrix[j][k] = Integer.parseInt(rowString[k]);
                }
            }

            for (int j = 0; j < (rows - 2); j++) {
                for (int k = 0; k < (colums - 2); k++) {
                    int temp = matrix[j][k] - matrix[j + 2][k + 2];

                    if (temp < 1) {
                        matrix[j][k] = 0;
                    } else {
                        matrix[j][k] = temp;
                    }
                }
            }

            System.out.println("New Matrix " + (i + 1) + ":");

            for (int j = 0; j < rows; j++) {
                for (int k = 0; k < colums; k++) {
                    System.out.print(matrix[j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
