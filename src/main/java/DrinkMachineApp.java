/**
 * This application is a simple simulator of a drink vending machine.
 * It allows user to choose drink, then ask them to insert coins and then serve chosen drink.
 * @author Maja Barwińska
 * @version 1.2
 * @see DrinkMachine
 * @see DrinkSelling
 * @see Drink
 * @see UserInput
 */
public class DrinkMachineApp {
    public static void main(String[] args) {
        DrinkMachine drinkMachine = new DrinkMachine();
        drinkMachine.start();

    }
}
