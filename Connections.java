import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Connections {
    List<String> all = new ArrayList<>(List.of(
            "hi", "Hello", "Hey", "wsp",
            "Blue", "Red", "Orange", "green",
            "Bye", "cya", "peace", "audi",
            "doctor", "scientist", "boffin", "labcoat"
    ));

    int guessCount = 0;

    String guess;

    Scanner userIn = new Scanner(System.in);

    List<String> shuffledCopy = all;

    public Connections() {
        Collections.shuffle(shuffledCopy);
    }

    // prints the board, four words per line
    public void printRows() {
        for (int i = 0; i < shuffledCopy.size(); i += 4) {
            System.out.println(
                    shuffledCopy.get(i) + "\t\t" +
                            shuffledCopy.get(i + 1) + "\t\t" +
                            shuffledCopy.get(i + 2) + "\t\t" +
                            shuffledCopy.get(i + 3));
        }
    }

    //Prompts user to match the words in the same category
    public void matchWords() {
        String[] splitGuess = new String[4];
        do{
            System.out.println("Type four words that belong in the same category, separated by spaces:");
            guess = userIn.nextLine();
            splitGuess = guess.split(" ");

            for(int i = 0; i < 4; i++){
                for(int j = 0; j < 3; j++){
                    for(int k = 0; k < 2; k++){
                        for(int l = 0; l < 1; l++) {
                            System.out.println(
                                    splitGuess[i] + " | " +
                                            splitGuess[j] + " | " +
                                            splitGuess[k] + " | " +
                                            splitGuess[l]
                            );
                        }
                    }
                }
            }
        } while(guessCount < 4);


    }


    /*public static void main(String[] args) {
        Connections game = new Connections();
        game.printRows();
        game.matchWords();
    }*/
}