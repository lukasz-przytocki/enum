package zad3;

public class Drink {
    private String drinkName;
    private double price;
    private DrinkType drinkType;

    public Drink(String drinkName, double price, DrinkType drinkType) {
        this.drinkName = drinkName;
        this.price = price;
        this.drinkType = drinkType;
    }

    public String getDrinkName() {
        return drinkName;
    }

    public void setDrinkName(String drinkName) {
        this.drinkName = drinkName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public DrinkType getDrinkType() {
        return drinkType;
    }

    public void setDrinkType(DrinkType drinkType) {
        this.drinkType = drinkType;
    }
}
