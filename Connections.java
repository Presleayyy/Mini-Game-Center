import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Connections {
    List<String> all = new ArrayList<>(List.of(
            "hi", "Hello", "Hey", "wsp",
            "Blue", "Red", "Orange", "green",
            "Bye", "cya", "peace", "audi",
            "doctor", "scientist", "boffin", "labcoat"
    ));

    public Connections() {
        Collections.shuffle(all);
    }

    // prints the board, four words per line
    public void printRows() {
        for (int i = 0; i < all.size(); i += 4) {
            System.out.println(
                    all.get(i) + "\t" +
                            all.get(i + 1) + "\t" +
                            all.get(i + 2) + "\t" +
                            all.get(i + 3));
        }
    }

    //Prompts user to match the words in the same category
    public void matchWords() {
        System.out.println("Type four words that belong in the same category, separated by spaces:");

    }

    // Counts attempts and restricts the user to maximum of 4 attempts. When finished, prints out the correct answers.
    public void countAttempts() {
        int attempts = 0;
        while (attempts < 4) {
            // logic to get user input and check if correct
            attempts++;
        }
        System.out.println("Maximum attempts reached. The correct answers are: ...");
    }
    public static void main(String[] args) {
        Connections game = new Connections();
        game.printRows();
        game.matchWords();
        game.countAttempts();
    }
}