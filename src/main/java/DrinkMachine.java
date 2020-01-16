import java.util.Map;
import java.util.TreeMap;

/**
 * This class contains functions of the drink vending machine.
 */
class DrinkMachine {
    private static double machineMoney;
    private boolean isStillRunning = true;
    private static Map<Integer, Drink> drinkMap;

    /**
     * Method that starts the machine. It runs until a customer
     * stops it by choosing that they don't want to buy another drink.
     */
    void start() {
        createDrinkStore();
        while (isStillRunning) {
            System.out.println("Hello to the Drink Machine!");
            showAllDrinksAvailable();
            sellDrink(UserInput.chooseDrink(), UserInput.insertCash());
            isStillRunning = false;
            if (UserInput.buyAnotherDrink()) {
                isStillRunning = true;
            } else {
                System.out.println("Thank you! Have a nice day!");
            }
        }
    }

    /**
     * Method that creates a TreeMap of available drinks which were added by an administrator.
     *
     * @return a TreeMap of drinks
     */
    Map<Integer, Drink> createDrinkStore() {
        drinkMap = new TreeMap<>();
        addDrink(1, new Drink(1, "Pepsi", 3.5));
        addDrink(2, new Drink(2, "Sprite", 3.5));
        addDrink(3, new Drink(3, "Fanta", 3.5));
        addDrink(4, new Drink(4, "RedBull", 6.0));
        addDrink(5, new Drink(5, "Water", 1.5));
        return drinkMap;
    }

    /**
     * Method that adds a new Drink object to the machine's offer.
     * @param number - represents integer which is going to be a key of the new element in the TreeMap
     * @param drink - represents Drink object which is going to be a value of the new element in the TreeMap
     */
    void addDrink(int number, Drink drink) {
        drinkMap.put(number, drink);
    }

    /**
     * Method that prints all elements of the TreeMap - all drinks available to buy in the machine.
     */
    private void showAllDrinksAvailable() {
        System.out.println("Drinks available:");
        for (Map.Entry<Integer, Drink> map : drinkMap.entrySet()) {
            System.out.println("" + map.getValue());
        }
    }

    /**
     * Method that sells the drink chosen by a customer.
     * @param drinkNumber - represents an integer which is the number of a drink in the machine
     * @param cash - represents a double which is the cash inserted by a customer
     */
    private void sellDrink(int drinkNumber, double cash) {
        if (isDrinkAvailable(drinkNumber)) {
            switch (drinkNumber) {
                case 1:
                    DrinkSelling drinkSelling = new DrinkSelling();
                    drinkSelling.sellPepsi(cash);
                    giveChange(drinkNumber, cash);
                    System.out.println("Enjoy your drink!");
                    break;
                case 2:
                    drinkSelling = new DrinkSelling();
                    drinkSelling.sellSprite(cash);
                    giveChange(drinkNumber, cash);
                    System.out.println("Enjoy your drink!");
                    break;
                case 3:
                    drinkSelling = new DrinkSelling();
                    drinkSelling.sellFanta(cash);
                    giveChange(drinkNumber, cash);
                    System.out.println("Enjoy your drink!");
                    break;
                case 4:
                    drinkSelling = new DrinkSelling();
                    drinkSelling.sellRedBull(cash);
                    giveChange(drinkNumber, cash);
                    System.out.println("Enjoy your drink!");
                    break;
                case 5:
                    drinkSelling = new DrinkSelling();
                    drinkSelling.sellWater(cash);
                    giveChange(drinkNumber, cash);
                    System.out.println("Enjoy your drink!");
                    break;
            }
        } else {
            System.out.println("Sorry, this drink is not available now");
        }

    }

    /**
     * Method that checks if a drink chosen by a customer is available at the moment.
     * @param drinkNumber - represents an integer which is the number of a drink in the machine
     * @return boolean - true when the amount of a chosen drink is greater than 0 or false when it's not
     */
    boolean isDrinkAvailable(int drinkNumber) {
        return drinkMap.get(drinkNumber).getAmount() != 0;
    }

    /**
     * Method that gives change if a customer inserted more money than chosen drink costs.
     * @param drinkNumber - - represents an integer which is the number of a drink in the machine
     * @param cash - represents a double which is the cash inserted by a customer
     */
    private void giveChange(int drinkNumber, double cash) {
        double change = cash - drinkMap.get(drinkNumber).getPrice();
        machineMoney -= change;
        System.out.println("Your change is: " + change);
    }

    /**
     * A getter of money which are currently stored in the machine
     * @return a double which represents machine's money
     */
    double getMachineMoney() {
        return machineMoney;
    }

    /**
     * A getter of the Map of all drinks in the machine.
     * @return a Map of drinks in the machine
     */
    Map<Integer, Drink> getDrinkMap() {
        return drinkMap;
    }

}
