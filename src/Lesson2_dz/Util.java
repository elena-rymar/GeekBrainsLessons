package Lesson2_dz;

public class Util {
    static void printArray(int[] arrayToPrint){
        for (int item : arrayToPrint){
            System.out.print(item + " ");
        }
    }

    static void printArray(int[][] arrayToPrint){
        for (int [] item : arrayToPrint){
            for (int inner : item)
            System.out.print(inner + " ");
        }
        System.out.println();
    }
}
