package day21_multiDimensionalArray;

import java.util.Arrays;

public class items {
    public static void main(String[] args) {
        String[][] items = {
                {"Apple", "Banana", "Grape", "Avocado"},
                {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
                {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
        };

        for (String[] each1D : items) {
            System.out.println();
            for (String eachItem : each1D) {
                System.out.print(eachItem+"\t");
            }
        }
        System.out.println();
        System.out.println("================================");
        for (String[] each1D : items) {
            System.out.println();
            for (int i = each1D.length-1; i >=0 ; i--) {
                String eachItem=each1D[i];
                System.out.print(eachItem+"\t");
            }

        }
        System.out.println();
        System.out.println("==========================================");

        for (int i=items.length-1; i >=0; i--) {
            System.out.println();
            for (String eachItem : items[i]) {
                System.out.print(eachItem+"\t");
            }
        }





    }
}
/*
Given the Array:
		String[][] items = {
					{"Apple", "Banana", "Grape", "Avocado"},
					{"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
					{"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
					};

		1. print the following output: (add \t between two words)
				Apple    Banana   Grape    Avocado
				Paper Towels     Toilet Papers   Tissues    Diapers
				Coke   Fanta   Arizona Tea   Pepsi   Water

		2. print the following output: (add \t between two words)
				Avocado   Grape    Banana    Apple
				Diapers   Tissues   Toilet Papers   Paper Towels
				Water    Pepsi    Arizona Tea    Fanta   Coke

		3. print the following output: (add \t between two words)
				Coke   Fanta   Arizona Tea   Pepsi   Water
				Paper Towels     Toilet Papers   Tissues    Diapers
				Apple    Banana   Grape    Avocado
 */