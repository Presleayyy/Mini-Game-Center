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

    public static void main(String[] args) {
        Connections game = new Connections();
        game.printRows();
    }
}