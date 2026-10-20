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
                // Call Connections game function here
            } else if (choice == 3) {
                System.out.println("Thank you for playing! Goodbye!");
            } else {
                System.out.println("Please enter 1, 2, or 3.");
            }
        } while (choice != 3);

        input.close();
    }
}