package Lesson2_dz;
//1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
// С помощью цикла и условия заменить 0 на 1, 1 на 0;

public class Task1 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for(int i = 0; i < arr.length; i++){
            arr[i] = (arr[i] == 1) ? 0 : 1 ;
        }
        Util.printArray(arr);
        }
}
