package Lesson1;

import java.util.Scanner;

public class Task3 {
    //4. Написать метод, принимающий на вход два числа, и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно),
    // если да – вернуть true, в противном случае – false;

    public static void main(String[] args) {
        int x = getSum();
        int c = 10;
        int d = 20;

        if (c <= x && x <= d)
        {
            System.out.println(true);
        }
        else
            System.out.println(false);
    }

    static int getSum(){
        System.out.print("Введите два числа: ");
        Scanner scan = new Scanner(System.in);
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();
        return number1 + number2;
    }



}
