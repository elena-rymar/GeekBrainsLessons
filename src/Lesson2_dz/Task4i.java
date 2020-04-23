package Lesson2_dz;
//4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
// и с помощью цикла(-ов) заполнить его диагональные элементы единицами;

public class Task4i {
    public static void main(String[] args) {
        int dimension = 5 ;
        int[][] arr = new int[dimension][dimension];
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
            arr[i][arr.length - i - 1] = 1;
            }

        Util.printArray(arr);
        }
}

