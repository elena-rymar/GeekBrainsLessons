package Lesson1;

import java.util.Scanner;

public class Task7 {
    //8. *Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль.
    // Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.

    public static void main(String[] args) {
        int c = 0;

        System.out.print("Введите год: ");
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();

        if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0)){
            System.out.println("Високосный");
        }
        else
            System.out.println("Невисокосный");
    }



}
