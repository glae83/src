package Example1;

import java.util.Random;
import java.util.Scanner;

/**
 * Класс в котором что-то делается
 * @author FileZebra
 * */
public class MainTest2lesson {
    static Scanner sc;
    static Random random;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        random = new Random();
//        String text = sc.next();
        someThink(5);
//        System.out.printf("Привет %s, как дела %s", text, text);
        printMatrix(generMatrix(8,100));
        System.out.println(matrixNoSize(1,2,3,4,5,6,7,8,9));
        String [] text = "gfdsgfh+!fsdhgf!gfsd!hghjsd".split("!");
        matrixString(text);

    }

    /**
    * Проверка текста
    * */
    static void someThink (int i){
        System.out.println("Что-то делаем здесь");
    }
/**
 * Генерируем матрицу
 * @param n размерность матрицы
 * @param m максимальное занчение элемента матрицы
 * */
    public static int [][] generMatrix(int n, int m){
        int [][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = random.nextInt(m);
            }
        }
        return arr;
    }
    /**
     * Печатаем матрицу
     * */
    public static void printMatrix(int arr [][]){
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                System.out.printf("%4d", arr[i][j]);
            }
            System.out.println();
        }
    }
    /**
     * Массив без размера
     * */
    static int matrixNoSize(int...arr2){
        int sum = 0;
        for (int i = 0; i < arr2.length; i++) {
            sum+=arr2[i];
        }
        return sum;
    }

    public static void matrixString(String text []){
        for (int i = 0; i < text.length; i++) {
            System.out.println(text[i]);
        }
    }
}