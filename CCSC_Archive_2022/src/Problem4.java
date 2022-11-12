import java.util.*;

public class Problem4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int cases = Integer.parseInt(input.nextLine());
        ArrayList<Integer> pointsNumber = new ArrayList<>();
        ArrayList<String> pointsString = new ArrayList<>();

        for (int i = 0; i < cases; i++) {
            pointsNumber.add(Integer.parseInt(input.nextLine()));

            for(int j = 0; j < pointsNumber.get(i); j++) {
                pointsString.add(input.nextLine());
            }
        }

        for (int i = 0; i < cases; i++) {

            double min = -1;

            for(int j = 0; j < pointsNumber.get(i) * 2; j++) {
                String[] pointsS = pointsString.get(j + i).split(" +");

                for(int k = 0; k < pointsNumber.get(i); k++) {
                    if(k == j) {
                        continue;
                    }


                }

            }
        }

    }

}
