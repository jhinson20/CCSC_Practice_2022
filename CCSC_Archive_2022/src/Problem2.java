import java.lang.reflect.Array;
import java.util.*;

public class Problem2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int guesses = Integer.parseInt(input.nextLine());

        ArrayList<String> guessesArray = new ArrayList<>();

        for (int i = 0; i < guesses; i++) {
            guessesArray.add(input.nextLine());
        }

        int cases = Integer.parseInt(input.nextLine());

        for(int i = 0; i < cases; i++) {
            String dailyWord = input.nextLine();
            char[] dailyWordArray = dailyWord.toCharArray();


            for(int j = 0; j < dailyWord.length(); j++) {
                hint[j] = '_';
            }

            for (int j = 0; j < 6; j++) {
                String guess = input.nextLine();
                if (dailyWord.equals(guess)) {
                    System.out.println("Your guess #" + (j+1) + " was " + guess + " = " + dailyWord);
                    System.out.println("You WON in " + (j+1) + " guesses");
                }
                else {

                    for(int k = 0; k < dailyWord.length(); k++) {
                        if(guess.charAt(k) == dailyWordArray[k]) {
                            hint[k] = guess.charAt(k);
                        }

                    }

                }
            }
        }
    }

}
