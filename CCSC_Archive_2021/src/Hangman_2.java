/*
Sample Input:
3
COMPUTER
E R C M O Q P U Y T
COMPUTER
A B C D E F
SCIENCE
Z Y E C I S N

Output:
Case #1: Congrats, you won on COMPUTER in 10 tries
Case #2: Sorry, you lost on COMPUTER in 6 tries C_____E_
Case #3: Congrats, you won on SCIENCE in 7 tries
 */

import java.util.*;

public class Hangman_2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int cases = Integer.parseInt(input.nextLine());

        ArrayList<String> words = new ArrayList<>();
        ArrayList<String> guesses = new ArrayList<>();

        for (int i = 0; i <cases; i++) {
            words.add(input.nextLine());
            guesses.add(input.nextLine());
        }

        for(int i = 0; i < cases; i++) {

            String word = words.get(i);
            String guess = guesses.get(i);

            ArrayList<Character> correctLetters = new ArrayList<>();

            int attempts = 0;
            int wrong = 0;

            for(int j = 0; j < guess.length(); j++) {
                if(guess.charAt(j) == ' ') {
                    continue;
                }

                attempts++;

                if(word.contains(guess.charAt(j) + "")) {
                    correctLetters.add(guess.charAt(j));
                }
                else {
                    wrong++;
                }
            }

            if(wrong < 4) {
                System.out.println("Case #" + i + ": Congrats, you won on " + word + " in " + attempts + " tries");
            }
            else {
                String word_ = word.toLowerCase();

                for(int j = 0; j< word_.length(); j++) {
                    if(correctLetters.contains((word_.charAt(j) + "").toUpperCase().charAt(0))) {
                        word_ = word_.substring(0,j) + (word_.charAt(j) + "").toUpperCase() + word_.substring(j+ 1);
                    }
                }

                for(int j = 0; j< word_.length(); j++) {
                    if(Character.isLowerCase(word_.charAt(j))) {
                        word_ = word_.substring(0,j) + "_" + word_.substring(j+1);
                    }
                }

                System.out.println("Case #" +  (i + 1) + ": Sorry, you lost on " + word + " in "  +
                        attempts + " tries " + word_);
            }

        }

    }
}