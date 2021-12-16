package Example3;

import java.util.Random;
import java.util.Scanner;

public class Lesson3 {
    static Random random;
    static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        random = new Random();
        yesNoTo();
    }
/**
 * угадай числ от 0 до 9
 * */
    public static void yesNoTo(){
            int userNumber;
            boolean yesNo;
            do {
                int k = 0;
                int n = random.nextInt(9);
                do {
                    System.out.print("Enter number ");
                    System.out.println(n);
                    userNumber = sc.nextInt();
                    k++;
                    if (n == userNumber) {
                        System.out.println("You are right");
                        break;
                    }else {
                        if (n<userNumber) {
                            System.out.println("Number is less");
                        } else {
                            System.out.println("Number is more");
                        }
                    }
                }
                while (k < 3);
                do
                {
                System.out.println("One more? 1 or 0");
                userNumber = sc.nextInt();
                if (userNumber == 0) {
                    break;
                }
                else {
                    if (userNumber!=1) {
                        System.out.println("Please, enter correct number");
                        System.out.println(userNumber);
                    }
                }
            }
                while (userNumber==0 || userNumber!=1);
            }
            while (userNumber!=0);
    }

    }
