import java.util.*;

public class Problem8 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int cases = Integer.parseInt(input.nextLine());

        ArrayList<String> sentences = new ArrayList<>();

        for (int i = 0; i < cases; i++) {
            sentences.add(input.nextLine());
        }

        for (int i = 0; i < cases; i++) {

            String sentence = sentences.get(i).toLowerCase();
            int[] counts = new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};

            for(int j = 0; j < sentence.length(); j++) {
                if(sentence.charAt(j) >= 97 && sentence.charAt(j) <= 122) {
                    counts[sentence.charAt(j)-97] += 1;
                }
            }

            System.out.print("Case " + (i + 1) + "> Used: ");

            for(int j = 0; j <26; j++) {
                if(counts[j] != 0) {
                    System.out.print((char)(j+97));
                }
            }

            System.out.print("; Missing: ");

            for(int j = 0; j <26; j++) {
                if(counts[j] == 0) {
                    System.out.print((char)(j+97));
                }
            }

            int maxIndex = 0;

            for(int j = 0; j <26; j++) {
                if(counts[j] > counts[maxIndex]) {
                    maxIndex = j;
                }
            }

            System.out.print("; Most Used: " + ((char)(maxIndex+97)) + "\n");




        }





    }

}
