package Lesson1;

import java.util.Scanner;

public class Task6 {
    //7. Написать метод, которому в качестве параметра передается строка, обозначающая имя,
    // метод должен вывести в консоль сообщение «Привет, указанное_имя!»;

    public static void main(String[] args) {
        int c = 0;

        System.out.print("Введите ваше имя: ");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();

        System.out.println("Привет, " + name);
    }



}
