import java.lang.reflect.Array;
import java.util.*;

public class Problem7 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String employees = input.nextLine();

        int cases = Integer.parseInt(employees.substring(0,employees.indexOf(" ")));

        ArrayList<String> start = new ArrayList<>();
        ArrayList<String> end = new ArrayList<>();
        ArrayList<Integer> breakTimeAray = new ArrayList<>();

        for (int i = 0; i < cases; i++) {
            String temp = input.nextLine().substring(6);
            start.add(temp.substring(0, temp.indexOf(" ")));
            temp = temp.substring(temp.indexOf(" ") + 1);
            temp = temp.substring(temp.indexOf(" ") + 1);
            end.add(temp.substring(0, temp.indexOf(" ")));
            temp = temp.substring(temp.indexOf(" ") + 1);
            temp = temp.substring(temp.indexOf(" ") + 1);
            temp = temp.substring(temp.indexOf(" ") + 1);
            breakTimeAray.add(Integer.parseInt(temp.substring(0, temp.indexOf(" "))));
        }

        for(int i = 0; i <cases; i++) {

            int startInt = Integer.parseInt(start.get(i).replace(":",""));
            int endInt = Integer.parseInt(end.get(i).replace(":",""));
            int breakTime = breakTimeAray.get(i);

            if(breakTime ==60) {
                breakTime = 40;
            }

            int middleTime = (startInt + endInt) /2;
            /*
            if((middleTime%100) > 60) {
                middleTime =middleTime +40;
            }

             */

            int breakStart = 0;
            int breakEnd = 0;

            if((middleTime%100 - (breakTime/2)) < 0) {
                breakStart = middleTime-(breakTime/2)-40;
            }
            else {
                breakStart = middleTime-(breakTime/2);
            }
            if((middleTime%100 + (breakTime/2)) > 60) {
                breakEnd = middleTime+(breakTime/2)+40;
            }
            else {
                breakEnd = middleTime+(breakTime/2);
            }



            System.out.println("Employee " + i +" can eat lunch from " +breakStart + " to " + breakEnd);

        }

    }

}
