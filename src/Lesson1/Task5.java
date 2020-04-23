package Lesson1;

import java.util.Scanner;

public class Task5 {
    //6. Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true, если число отрицательное;

    public static void main(String[] args) {
        int c = 0;

        System.out.print("Введите отрицательное число: ");
        Scanner scan = new Scanner(System.in);
        int number1 = scan.nextInt();


        if (c <= number1)
        {
            System.out.println("Введено положительное число");
        }
        else
            System.out.println(true);
    }



}
