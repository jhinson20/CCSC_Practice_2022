/*
Sample Input:
4
-1.0 4.0
-1.0 3.0
2.0 3.0
-10.0 10.0

Sample Output:
case 1, minimum of -9.0 at x=-1.0, maximum of 6.0 at x=4.0
case 2, minimum of -9.0 at x=-1.0, maximum of 3.4 at x=0.6
case 3, minimum of -1.3 at x=2.7, maximum of 0.0 at x=2.0
case 4, minimum of -1548.0 at x=-10.0, maximum of 552.0 at x=10.0
 */

import java.text.DecimalFormat;
import java.util.*;

public class Max_MinTheorem_7 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###.#");

        int cases = Integer.parseInt(input.nextLine());
        ArrayList<String> min_maxString = new ArrayList<>();


        for (int i = 0; i < cases; i++) {
            min_maxString.add(input.nextLine());
        }

        for (int i = 0; i < cases; i++) {

            double min = Double.parseDouble(min_maxString.get(i).substring(0, min_maxString.get(i).indexOf('.') + 2));
            min_maxString.set(i, min_maxString.get(i).substring(min_maxString.get(i).indexOf('.') + 3));
            double max = Double.parseDouble(min_maxString.get(i));

            double localmin = 10000;
            double localminIndex = 0;
            double localmax = -10000;
            double localmaxIndex = 0;

            for (; min <= max; min+=0.00001) {
                double temp = Math.pow(min, 3) - 5 * Math.pow(min, 2) + 5 * min + 2;

                if(temp > localmax) {
                    localmax = temp;
                    localmaxIndex = min;
                }

                if(temp < localmin) {
                    localmin = temp;
                    localminIndex = min;
                }

            }

            System.out.println("case " + (i + 1) + ", minimum of " + Double.parseDouble(df.format(localmin)) + " at x=" +
                    Double.parseDouble(df.format(localminIndex)) + ", maximum of " + Double.parseDouble(df.format(localmax)) +
                    " at x=" + Double.parseDouble(df.format(localmaxIndex)));

        }

    }
}
