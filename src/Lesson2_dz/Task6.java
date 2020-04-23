package Lesson2_dz;
//6. Написать метод, в который передается не пустой одномерный целочисленный массив,
// метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
// Примеры: checkBalance([1, 1, 1, || 2, 1]) → true, checkBalance ([2, 1, 1, 2, 1]) → false,
// checkBalance ([10, || 10]) → true, граница показана символами ||, эти символы в массив не входят;

public class Task6 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 1};
        System.out.print ("checkBalance: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print (arr[i] + " ");
        }
        System.out.print(" → " + checkBalance(arr));

    }
    private static boolean checkBalance(int[] arrParam) {
        int lSum, rSum;

        for (int i = 0; i < arrParam.length + 1; i++) {
            lSum = 0;
            rSum = 0;

            for (int j = 0; j < i; j++) {
                lSum += arrParam[j];
            }

            for (int j = i; j < arrParam.length; j++) {
                rSum += arrParam[j];
            }

            if (lSum == rSum) return true;
        }
        return false;
    }
}
