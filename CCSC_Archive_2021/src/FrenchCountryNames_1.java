/*
Sample Input:
6
Mexique
Canada
Etats-Unis
Australie
Bahrein
Gambie

Sample Output:
le Mexique
le Canada
les Etats-Unis
l'Australie
le Bahrein
la Gambie
 */

import java.util.*;

public class FrenchCountryNames_1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int cases = Integer.parseInt(input.nextLine());
        ArrayList<String> countries = new ArrayList<>();
        ArrayList<Character> vowels = new ArrayList<>(Arrays.asList('a','e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        ArrayList<String> exceptions = new ArrayList<>(Arrays.asList("Belize", "Cambodge", "Mexique", "Mozambique", "Zaire", "Zimbabwe"));
        ArrayList<String> exceptionsPlural = new ArrayList<>(Arrays.asList("Etats-Unis", "Pays-Bas"));

        for(int i =0; i < cases; i++) {
            countries.add(input.nextLine());
        }

        for(int i =0; i < cases; i++) {

            if(exceptionsPlural.contains(countries.get(i))) {
                countries.set(i, "les " + countries.get(i));
            }
            else if(exceptions.contains(countries.get(i))) {
                countries.set(i, "le " + countries.get(i));
            }
            else if(vowels.contains(countries.get(i).charAt(0))) {
                countries.set(i, "l'" + countries.get(i));
            }
            else if((countries.get(i).charAt(countries.get(i).length() - 1)) == 'e') {
                countries.set(i, "la " + countries.get(i));
            }
            else {
                countries.set(i, "le " + countries.get(i));
            }

            System.out.println(countries.get(i));
        }

    }
}
