import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Welcome to the Mini-Game Center! Please Select:");
            System.out.println("1 - Mini Sudoku");
            System.out.println("2 - Connections");
            System.out.println("3 - Quit");

            choice = input.nextInt();

            if (choice == 1) {
                System.out.println("You have selected Mini Sudoku!");
                // Call Mini Sudoku game function here
            } else if (choice == 2) {
                System.out.println("You have selected Connections!");
                Connections game = new Connections();
                game.printRows();
            } else if (choice == 3) {
                System.out.println("Thank you for playing! Goodbye!");
            }

        } while (choice != 3);

        input.close();
    }
}