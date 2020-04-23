package Lesson1;

public class Task2 {
    //a * (b + (c / d))

    public static void main(String[] args) {
        int x = getAll();
        System.out.println(x);
    }

    static int getAll(){
        int a = 2;
        int b = 3;
        int c = 12;
        int d = 4;
        return a * (b + (c / d));
    }

}
