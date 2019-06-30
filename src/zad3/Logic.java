package zad3;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Logic {

    private static String getOrder() {
        String order;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please order drink");
        order = scan.nextLine();
        return order;
    }

    static Set<String> drinkList(ArrayList<Drink> drinks) {
        TreeSet<String> drinkSet = new TreeSet<>();
        for (Drink drink : drinks) {
            drinkSet.add(drink.getDrinkName());
        }
        return drinkSet;
    }

    void MainLogic(ArrayList<Drink> drinks) {
        String order = getOrder();
        Scanner scanner = new Scanner(System.in);
        if (drinkList(drinks).contains(order)) {
            for (Drink drink : drinks) {
                if (drink.getDrinkName().equalsIgnoreCase(order) && drink.getDrinkType().equals(DrinkType.ALCOHOLIC)) {
                    System.out.println("Please enter your age: ");
                    if (scanner.nextInt() >= 18) {
                        System.out.println("Cena za drinka " + drink.getPrice());
                    } else {
                        System.out.println("Jesteś za młody");
                    }
                } else if (drink.getDrinkName().equalsIgnoreCase(order) && ((drink.getDrinkType().equals(DrinkType.SMOOTHIE)) ||
                        (drink.getDrinkType().equals(DrinkType.SOFT)))) {
                    System.out.println("Cena za drinka " + drink.getPrice());
                }
            }

        }else{
            System.out.println("Nie ma takiego drinka");
        }
    }

}
