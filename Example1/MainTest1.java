package Example1;

import java.util.Arrays;

public class MainTest1 {
    public static void main(String[] args) {
        byte[][] arr = new byte[5][5];
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7};
        int shift = 8;
        matrix(arr);
//        countMax(arr);
//        minMax(arr1);
//        System.out.println(count(arr1));
        shiftMatrix(arr1, shift);
//        test1();
    }

    public static void matrix(byte[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = 8;
            }
        }
//        System.out.println(Arrays.toString(arr));
    }
    public static void countMax(byte[][] arr) {
        for (byte i = 0; i < arr.length; i++) {
            for (byte j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                }
            }
//            System.out.println(Arrays.toString(arr));
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%2d" + " ", arr[i][j]);
            }
            System.out.println();
        }

    }
    public static void minMax(int[] arr1) {
        int max = arr1[0];
        int min = arr1[0];
        for (int i = 1; i < arr1.length; i++) {
            if (max < arr1[i]) {
                max = arr1[i];
            }
            if (min > arr1[i]) {
                min = arr1[i];
            }

        }
        System.out.println("Max:" + max + " Min:" + min);
    }
    public static boolean count(int[] arr1) {
        int sum = 0;
        int sum2 = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum = arr1[i] + sum;
        }
        for (int i = 0; i < arr1.length; i++) {
            sum2 = arr1[i] + sum2;
            if (sum2 == sum - sum2) {
                break;
            }

        }
        return sum2 == sum - sum2;
    }

    public static void shiftMatrix(int[] arr1, int shift) {
        if (shift > arr1.length) {
            shift = shift % arr1.length;
        }
        System.out.println(shift);
        for (int j = 0; j < shift; j++) {
            int temp = arr1[0];
            int temp2 = 0;

            for (int i = 0; i < arr1.length - 1; i++) {

                if (i != arr1.length - 2) {
                    temp2 = arr1[i + 1];
                    arr1[i + 1] = temp;
                    temp = temp2;
                } else {
                    temp2 = arr1[i + 1];
                    arr1[i + 1] = temp;
                    arr1[0] = temp2;
                }
            }
        }
        System.out.println(Arrays.toString(arr1));
    }

    public static void test1(){
        int z;
        int count = 11;

        z = count % 5 ;
        System.out.println(z);


    }

}


