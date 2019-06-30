package zad1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<TireParam> tireParams = new ArrayList<>();
        tireParams.add(new TireParam(Type.SUMMER, "Car", 17));
        tireParams.add(new TireParam(Type.WINTER, "Motorbike", 18));
        tireParams.add(new TireParam(Type.ALL_SEAZON, "Tractor", 19));

        for (int i = 0; i <tireParams.size() ; i++) {
            System.out.println(tireParams.get(i).toString());

        }

        for (TireParam tire:tireParams){
            System.out.println(tire.toString());
        }

        }

    }

