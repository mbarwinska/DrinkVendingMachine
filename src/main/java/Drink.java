/**
 * This is a pojo class.
 */

 class Drink {
    private int number;
    private String name;
    private double price;
    private int amount;

    /**
     * A custom constructor
     * @param number - the number of drink in the machine
     * @param name - the name of a drink
     * @param price - the price of a drink
     */
    Drink(int number, String name, double price) {
        this.number = number;
        this.name = name;
        this.price = price;
        this.amount = 10;
    }

    public int getNumber() {
        return number;
    }

    String getName() {
        return name;
    }

    double getPrice() {
        return price;
    }

    int getAmount() {
        return amount;
    }

    void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return  "{number=" + number +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                '}';
    }
}
