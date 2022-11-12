import java.text.DecimalFormat;
import java.util.*;

public class MilitaryTime_1 {
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            int cases = Integer.parseInt(input.nextLine());
            ArrayList<String> timesString = new ArrayList<>();

            for (int i = 0; i < cases; i++) {
                timesString.add(input.nextLine());
            }

            for(int i = 0; i < cases; i++) {

                int firstNumber = Integer.parseInt(timesString.get(i).substring(0, timesString.get(i).indexOf(" ")));
                int secondNumber = Integer.parseInt(timesString.get(i).substring(timesString.get(i).indexOf(" ") + 1));

                DecimalFormat df = new DecimalFormat("0000");

                int answer = 0;

                if(firstNumber <= secondNumber) {
                    answer = secondNumber - firstNumber;
                }
                else {
                    secondNumber += 2400;
                    answer = secondNumber - firstNumber;
                }

                String answerString = df.format(answer);

                String hours = "";
                String minutes = "";

                if(answerString.charAt(2) == '0') {
                    minutes = answerString.charAt(3) + "";
                }
                else {
                    if(Integer.parseInt(answerString.charAt(2) + "") > 5) {
                        int firstInt = Integer.parseInt(answerString.charAt(2) + "");
                        firstInt -= 4;
                        minutes = firstInt + "" + answerString.charAt(3);
                    }
                    else {
                        minutes = answerString.substring(2);
                    }
                }

                if(answerString.charAt(0) == '0') {
                    hours = answerString.charAt(1) + "";
                }
                else {
                    hours = answerString.substring(0,2);
                }


                System.out.println(hours + " hours " + minutes + " minutes");

            }
        }
}
