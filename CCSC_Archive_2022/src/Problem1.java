import java.util.*;

public class Problem1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int cases = Integer.parseInt(input.nextLine());
        ArrayList<Integer> years = new ArrayList<>();

        for(int i = 0; i< cases; i++) {
            years.add(Integer.parseInt(input.nextLine()));
        }

        for(int i = 0; i < cases; i++) {

            if(years.get(i) < 1982 || years.get(i) > 2048) {
                System.out.println("Date out of range");
                continue;
            }

            int a = years.get(i) % 19;
            int b = years.get(i) % 4;
            int c = years.get(i) % 7;
            int d = (19 * a +24) %30;
            int e = (2*b+4*c+6*d+5) % 7;
            int f = (22+d+e);

            if(f <= 31) {
                System.out.println("Easter Sunday in " + years.get(i) + ": March " + f);
            }
            else {
                System.out.println("Easter Sunday in " + years.get(i) + ": April " + (f - 31));
            }

        }

    }

}
