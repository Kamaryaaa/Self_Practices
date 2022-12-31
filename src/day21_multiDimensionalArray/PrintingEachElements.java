package day21_multiDimensionalArray;

public class PrintingEachElements {
    public static void main(String[] args) {

        String[][][][][][][][][][]  array = {{{{{{{{{{"I", "Love", "Arrays"}}}}}}}}}};

        for (String[][][][][][][][][] each9D : array) {
            for (String[][][][][][][][] each8D : each9D) {
                for (String[][][][][][][] each7D : each8D) {
                    for (String[][][][][][] each6D : each7D) {
                        for (String[][][][][] each5D : each6D) {
                            for (String[][][][] each4D : each5D) {
                                for (String[][][] each3D : each4D) {
                                    for (String[][] each2D : each3D) {
                                        for (String[] each1D : each2D) {
                                            for (String each : each1D) {
                                                System.out.println(each);

                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }

        }



    }
}
/*
Given the following array:
		 String[][][][][][][][][][]  array = {{{{{{{{{{"I", "Love", "Arrays"}}}}}}}}}};

	 Write a program that can display each elements of the given array

 */
