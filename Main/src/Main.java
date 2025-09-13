import java.lang.Math;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean wantsToPlay = true;
        while(wantsToPlay) {
            StartGame(scanner);
            System.out.print("Do you want to play again? y/n: ");
            String answer = scanner.next();
            if (!answer.equalsIgnoreCase("y") && !answer.equalsIgnoreCase("n")) {
                while(!answer.equalsIgnoreCase("y") && !answer.equalsIgnoreCase("n")) {
                System.out.println("Wrong input! Try again. Do you want to play again? y/n: ");
                answer = scanner.next();
                }
            }
            else if (answer.equalsIgnoreCase("n")){
                wantsToPlay = false;
            }


        }

    }
    public static void StartGame(Scanner scanner) {
        int randomNum = (int) (Math.random()  * 10) + 1;
        System.out.println("Random number in range 1-10 had been chosen. Try to guess it.");
        int tries = 3;
        boolean hadWon = false;
        System.out.println("You have " + tries + " tries left");
        int userTry;
        System.out.print("> Your guess is: ");

        while (tries > 0 && !hadWon) {
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Must be a number, try again");
                scanner.next();
            }
            userTry = scanner.nextInt();

            if (userTry == randomNum) {
                hadWon = true;
                break;
            }
            else if (userTry > randomNum) {
                System.out.println("Too big");
                tries--;
                System.out.println("You have " + tries + " tries left");
            }
            else {
                System.out.println("Too small");
                tries--;
                System.out.println("You have " + tries + " tries left");
            }
        }
        if(hadWon) {
            System.out.println("You won!");
        }
        else {
            System.out.println("You lost!");
        }
    }
}
