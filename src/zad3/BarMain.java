package zad3;

import java.util.ArrayList;

public class BarMain {
    public static void main(String[] args) {
        ArrayList<Drink> drinks = new ArrayList<>();
        drinks.add(new Drink("Mohito", 12, DrinkType.SOFT));
        drinks.add(new Drink("Vodka with ice", 15, DrinkType.ALCOHOLIC));
        drinks.add(new Drink("Orange", 10, DrinkType.SMOOTHIE));

        Logic logic = new Logic();
        logic.MainLogic(drinks);

    }


}
