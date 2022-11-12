import java.util.*;

public class Problem9 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[][] matrix = new String[6][6];

        for(int i =0 ; i<6; i++) {
            String temp = input.nextLine();
            matrix[i] = temp.split(" ");
        }

        int cases = Integer.parseInt(input.nextLine());

        ArrayList<String> words = new ArrayList<>();

        for(int i = 0; i < cases; i++) {
            words.add(input.nextLine());
        }

        for(int i = 0; i < cases; i++) {

            String word = words.get(i);

            for(int j = 0; j < word.length(); j++) {
                
            }

        }

    }

}
