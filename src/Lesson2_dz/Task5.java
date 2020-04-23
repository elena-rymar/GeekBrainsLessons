package Lesson2_dz;
//5. Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);

public class Task5 {
    public static void main(String[] args) {
        int[] arr = {3, 9, 6, 2, 10, 4, 5, 7};
        findMinMax(arr);
    }
    private static void findMinMax (int[] search) {
        int min = 0, max = 0;

        for(int i = 0; i != search.length; i++)
        {
            if(i == 0){
                max = search[i];
                min = search[i];
            }
            else {
                max = (search[i] > max) ? search[i]: max;
                min = (search[i] < min) ? search[i]: min;
            }
        }
        System.out.println("min = " + min + " max = " + max);
    }
}
