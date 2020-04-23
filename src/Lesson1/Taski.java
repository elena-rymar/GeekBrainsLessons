package Lesson1;

public class Taski {
    public static void main(String[] args) {
        do01();
        System.out.println(do02(1,2,3,4));
        System.out.println(do03(4, 11));
        do04(-5);
        System.out.println(do05(-100));
        do06("Р”СЂСѓРі");
        do07(2020);
    }
    static void do01(){
        System.out.println("Р—Р°РґР°РЅРёРµ 1:");
        byte a = 10;
        short b = 1010;
        int c = 121212;
        long d = 2000L;
        float e = 1500.0f;
        double f = 12.658741;
        boolean bool = false;
        char g = 'C';

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(bool);
        System.out.println(g);
    }

    static double do02(double a, double b, double c, double d) {
        System.out.println("\nР—Р°РґР°РЅРёРµ 2:");
        return a * (b + (c / d));
    }

    static boolean do03(int a, int b){
        System.out.println("\nР—Р°РґР°РЅРёРµ 3:");
        int sum = a +b;
        if (sum>10 && sum<20) return true;
        else return false;
    }
    static void do04(int a){
        System.out.println("\nР—Р°РґР°РЅРёРµ 4:");
        if (a>=0) System.out.println("Р§РёСЃР»Рѕ РїРѕР»РѕР¶РёС‚РµР»СЊРЅРѕРµ");
        else System.out.println("Р§РёСЃР»Рѕ " + a + " РѕС‚СЂРёС†Р°С‚РµР»СЊРЅРѕРµ");
    }
    static boolean do05(int a){
        System.out.println("\nР—Р°РґР°РЅРёРµ 5:");
        if (a < 0) return true;
        else return false;
    }
    static void do06(String name){
        System.out.println("\nР—Р°РґР°РЅРёРµ 6:");
        System.out.println("РџСЂРёРІРµС‚ " + name + "!");
    }
    static void do07(int y){
        System.out.println("\nР—Р°РґР°РЅРёРµ 7:");
        if (!(y % 4 == 0) || ((y % 100 == 0) && !(y % 400 == 0))) System.out.println(y + " РіРѕРґ РЅРµ РІРёСЃРѕРєРѕСЃРЅС‹Р№");
        else System.out.println(y + " РіРѕРґ РІРёСЃРѕРєРѕСЃРЅС‹Р№");
    }

    public static class Task8 {
        public static void main(String[] args) {
            int[] arr6 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};



            System.out.println("\r\n7 - задание +3 сдвига");
            shiftOfNumbers(arr6, 3);

            System.out.println("\r\n7 - задание -3 сдвига");
            shiftOfNumbers(arr6, -3);



        }
        private static void shiftOfNumbers(int[] arrParam, int n) {
            //посмотрим матрицу до сдвмга
            for (int i : arrParam) System.out.print(i + " ");
            System.out.println("\r\n");

            if (n > 0) {
                for (int x = 0; x < n; x++) {
                    int buf = arrParam[arrParam.length - 1];
                    if (arrParam.length - 1 >= 0) System.arraycopy(arrParam, 0, arrParam, 1, arrParam.length - 1);
                    arrParam[0] = buf;
                    //смотрим матрицу после каждого сдвига
                    for (int i : arrParam)
                        System.out.print(i + " ");
                    System.out.println();
                }

            }
            if (n < 0) {
                for (int x = 0; x > n; x--) {
                    int buf = arrParam[0];
                    System.arraycopy(arrParam, 1, arrParam, 0, arrParam.length - 1);
                    arrParam[arrParam.length - 1] = buf;
                    //смотрим матрицу после каждого сдвига
                    for (int i : arrParam) System.out.print(i + " ");
                    System.out.print("\r\n");
                }
            }
        }
    }
}