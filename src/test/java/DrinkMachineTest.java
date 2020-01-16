import org.junit.Test;

import java.util.Map;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class DrinkMachineTest {
    @Test
    public void shouldCheckIfSizeOfDrinkMapIsEqualTo5() {
        //given
        DrinkMachine drinkMachine = new DrinkMachine();
        int expectedSize = 5;
        //when
        Map<Integer, Drink> drinkMap = drinkMachine.createDrinkStore();
        //then
        assertThat(drinkMap.size()).isEqualTo(expectedSize);
    }

    @Test
    public void shouldIncreaseDrinkMapSizeBy1WhenNewDrinkIsAdded() {
        //given
        DrinkMachine drinkMachine = new DrinkMachine();
        Map<Integer, Drink> drinkMap = drinkMachine.createDrinkStore();
        int expectedSize = 6;
        //when
        drinkMachine.addDrink(6, new Drink(6, "Apple Juice", 4));
        int actualSize = drinkMap.size();
        //then
        assertThat(actualSize).isEqualTo(expectedSize);
    }

    @Test
    public void shouldReturnTrueWhenAmountOfDrinkIsGreaterOrEqualTo1() {
        //given
        DrinkMachine drinkMachine = new DrinkMachine();
        Map<Integer, Drink> drinkMap = drinkMachine.createDrinkStore();
        //when
        boolean actual = drinkMachine.isDrinkAvailable(1);
        //then
        assertThat(actual).isEqualTo(true);
    }

    @Test
    public void shouldReturnFalseWhenAmountOfDrinkIsEqualTo0() {
        //given
        DrinkMachine drinkMachine = new DrinkMachine();
        Map<Integer, Drink> drinkMap = drinkMachine.createDrinkStore();
        //when
        drinkMap.get(1).setAmount(0);
        boolean actual = drinkMachine.isDrinkAvailable(1);
        //then
        assertThat(actual).isEqualTo(false);
    }
}
