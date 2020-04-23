package Lesson1;

import java.util.Scanner;

public class Task4 {
    //5. Написать метод, которому в качестве параметра передается целое число,
    // метод должен напечатать в консоль положительное число передали или отрицательное
    // (Замечание: ноль считаем положительным числом.);

    public static void main(String[] args) {
        int c = 0;

        System.out.print("Введите число: ");
        Scanner scan = new Scanner(System.in);
        int number1 = scan.nextInt();


        if (c <= number1)
        {
            System.out.println("Введено положительное число");
        }
        else
            System.out.println("Введено отрицательное число");
    }



}
