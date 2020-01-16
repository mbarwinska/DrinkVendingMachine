/**
 * This class contains methods which are implemented inside sellDrink method from DrinkMachine class.
 * They are responsible for selling particular kind of drink which was chosen by a customer.
 */
class DrinkSelling {

    /**
     * Method that sells customer Pepsi when they inserted enough cash or prints that they didn't insert enough money.
     * @param cash - represents a double which is the cash inserted by a customer
     */
    void sellPepsi(double cash) {
        DrinkMachine drinkMachine = new DrinkMachine();
        System.out.println("You chose " + drinkMachine.getDrinkMap().get(1).getName());
        if (cash >= drinkMachine.getDrinkMap().get(1).getPrice()) {
            drinkMachine.getDrinkMap().get(1).setAmount(drinkMachine.getDrinkMap().get(1).getAmount() - 1);
            double machineMoney = drinkMachine.getMachineMoney();
            machineMoney += cash;
        } else {
            System.out.println("Wrzuciłeś za mało pieniędzy");
        }
    }

    /**
     * Method that sells customer Sprite when they inserted enough cash or prints that they didn't insert enough money.
     * @param cash - represents a double which is the cash inserted by a customer
     */
    void sellSprite(double cash) {
        DrinkMachine drinkMachine = new DrinkMachine();
        System.out.println("You chose " + drinkMachine.getDrinkMap().get(2).getName());
        if (cash >= drinkMachine.getDrinkMap().get(2).getPrice()) {
            drinkMachine.getDrinkMap().get(2).setAmount(drinkMachine.getDrinkMap().get(2).getAmount() - 1);
            double machineMoney = drinkMachine.getMachineMoney();
            machineMoney += cash;
        } else {
            System.out.println("Wrzuciłeś za mało pieniędzy");
        }
    }

    /**
     * Method that sells customer Fanta when they inserted enough cash or prints that they didn't insert enough money.
     * @param cash - represents a double which is the cash inserted by a customer
     */
    void sellFanta(double cash) {
        DrinkMachine drinkMachine = new DrinkMachine();
        System.out.println("You chose " + drinkMachine.getDrinkMap().get(3).getName());
        if (cash >= drinkMachine.getDrinkMap().get(3).getPrice()) {
            drinkMachine.getDrinkMap().get(3).setAmount(drinkMachine.getDrinkMap().get(3).getAmount() - 1);
            double machineMoney = drinkMachine.getMachineMoney();
            machineMoney += cash;
        } else {
            System.out.println("Wrzuciłeś za mało pieniędzy");
        }
    }

    /**
     * Method that sells customer RedBull when they inserted enough cash or prints that they didn't insert enough money.
     * @param cash - represents a double which is the cash inserted by a customer
     */
    void sellRedBull(double cash) {
        DrinkMachine drinkMachine = new DrinkMachine();
        System.out.println("You chose " + drinkMachine.getDrinkMap().get(4).getName());
        if (cash >= drinkMachine.getDrinkMap().get(4).getPrice()) {
            drinkMachine.getDrinkMap().get(4).setAmount(drinkMachine.getDrinkMap().get(4).getAmount() - 1);
            double machineMoney = drinkMachine.getMachineMoney();
            machineMoney += cash;
        } else {
            System.out.println("Wrzuciłeś za mało pieniędzy");
        }
    }

    /**
     * Method that sells customer water when they inserted enough cash or prints that they didn't insert enough money.
     * @param cash - represents a double which is the cash inserted by a customer
     */
    void sellWater(double cash) {
        DrinkMachine drinkMachine = new DrinkMachine();
        System.out.println("You chose " + drinkMachine.getDrinkMap().get(5).getName());
        if (cash >= drinkMachine.getDrinkMap().get(5).getPrice()) {
            drinkMachine.getDrinkMap().get(5).setAmount(drinkMachine.getDrinkMap().get(5).getAmount() - 1);
            double machineMoney = drinkMachine.getMachineMoney();
            machineMoney += cash;
        } else {
            System.out.println("Wrzuciłeś za mało pieniędzy");
        }
    }
}
