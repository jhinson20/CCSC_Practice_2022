import java.util.*;

public class Problem9 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        char[][] matrix = new char[6][6];

        for(int i =0 ; i<6; i++) {
            String temp = input.nextLine();
            matrix[i] = temp.replaceAll("\\s", "").toCharArray();
        }

        int cases = Integer.parseInt(input.nextLine());

        ArrayList<String> words = new ArrayList<>();

        for(int i = 0; i < cases; i++) {
            words.add(input.nextLine());
        }

        for(int i = 0; i < cases; i++) {

            String word = words.get(i);
            char[] wordArray = word.toCharArray();


            for(int j = 0; j < word.length()-1;) {
                char char1 = word.charAt(j);
                char char2 = word.charAt(j + 1);

                int char1row = 0;
                int char1col = 0;
                int char2row = 0;
                int char2col = 0;

                for(int k = 0; k < 6; k++) {
                    for(int l = 0; l<6; l++) {
                        if (matrix[k][l] == char1) {
                            char1row = k;
                            char1col = l;
                        }
                        if (matrix[k][l] == char2) {
                            char2row = k;
                            char2col = l;
                        }
                    }
                }

                if (char1row == char2row || char1col == char2col) {
                    char temp = wordArray[j];
                    wordArray[j] = wordArray[j+1];
                    wordArray[j+1] = temp;
                }
                else {
                    wordArray[j] = matrix[char1row][char2col];
                    wordArray[j+1] = matrix[char2row][char1col];
                }



                j+= 2;
            }

            System.out.print("Word #" + (i+1) + " " + word + " is encrypted as ");

            for(int k = 0; k < word.length(); k++) {
                System.out.print(wordArray[k]);
            }

            System.out.println();

        }

    }

}
