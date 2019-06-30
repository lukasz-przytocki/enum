package zajecia;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum DishType {
    MEAT("Danie mięsne", "mięsiwo", "mięsko"),
    VEGE("Danie wege"),
    VEGETARIAN("Danie wegańskie");

    private final String[] names;

    DishType(String... names) {
        this.names = names;
    }

    public String[] getNames() {
        return names;
    }

    static DishType convertFromString(String dishName) {
        DishType[] values = values();
        for (DishType dishType : values) {
            if(checkValue(dishName, dishType.names))
                return dishType;
        }
        throw new IllegalArgumentException("value not found");
    }

    private static boolean checkValue(String name, String[] names) {
        for (String n : names) {
            if(n.equals(name))
                return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return Arrays.toString(names);
    }
}
