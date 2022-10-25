import java.util.*;

public class Hangman_2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int cases = input.nextInt();
        input.nextLine();
        System.out.println();

        for(int i = 0; i < cases; i++) {

            String word = input.nextLine();
            boolean test = input.hasNextLine();
            String guess = input.next();
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
                System.out.println("Case #" + i + ": Congrats, you won on" + word + " in " + attempts + " tries");
            }
            else {
                String word_ = "";
                for(int j = 0; j < word.length(); j++) {
                    word_ += "_";
                }

                for(int j = 0; j < word.length(); j++) {
                    for (int k = 0; k < correctLetters.size(); k++) {
                        if(word.charAt(j) == correctLetters.indexOf(k)) {
                            char[] chararray = word_.toCharArray();
                            chararray[j] = (word.charAt(j) + "").toUpperCase().charAt(0);
                            word_ = chararray.toString();
                        }
                    }
                }

                System.out.println("Case #" +  (i + 1) + ": Sorry, you lost on " + word + " in "  +
                        attempts + " tries " + word_);
            }

        }

    }
}