import java.util.Scanner;

/**
 * This is a class with static methods that represent activities of a customer who uses the machine.
 */
class UserInput {

    /**
     * Method that asks a customer to choose the number of a drink from the machine
     * @return an integer that represents customer's choice
     */
    static int chooseDrink() {
        System.out.println("Choose the number of the drink!");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    /**
     * Method that asks a customer to insert cash into the machine.
     * @return a double that represents amount of money inserted by a customer
     */
    static double insertCash() {
        System.out.println("Insert coins!");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    /**
     * Method that asks a customer if they want to buy another drink after already buying one.
     * @return boolean - true if a customer want another drink or false if they don't
     */
    static boolean buyAnotherDrink() {
        System.out.println("Would you like to buy another drink? Press Y/N");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();
        return choice.equalsIgnoreCase("Y");
    }
}
