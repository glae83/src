package example3;

import java.util.Random;
import java.util.Scanner;

public class Lesson3 {
    static Random random;
    static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        random = new Random();
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
//      yesNoTo();
//        yesNoWord(words);
        int choose;
        do {
            System.out.println("Выберите какую игру хотите:");
            System.out.println("1- Угадай число, 2- Угадай слово, 3 - Выход");
            choose = sc.nextInt();
            switch (choose) {
                case (1):
                    yesNoTo();
                    break;
                case (2):
                    yesNoWord(words);
                    break;
                case (3):

                    break;
            }


        } while (choose != 3);
    }

    /**
     * угадай числ от 0 до 9
     */
//region Угадать число
    public static void yesNoTo() {
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
                } else {
                    if (n < userNumber) {
                        System.out.println("Number is less");
                    } else {
                        System.out.println("Number is more");
                    }
                }
            }
            while (k < 3);
            do {
                System.out.println("One more? 1 or 0");
                userNumber = sc.nextInt();
                if (userNumber == 0) {
                    break;
                } else {
                    if (userNumber != 1) {
                        System.out.println("Please, enter correct number");
                        System.out.println(userNumber);
                    }
                }
            }
            while (userNumber == 0 || userNumber != 1);
        }
        while (userNumber != 0);
    }
    //endregion
/**
 * Угадай слово
 * @param robotWord слово
 * */
    public static void yesNoWord(String words[]) {
        int word = random.nextInt(words.length);
//    do{
//        System.out.println("Угадай слово");
        System.out.println(words[word]);
        String robotWord = words[word];
//        String userWord = sc.next();
//      String robotWord = words[word];
        String exitWord = "###############";
//      System.out.println(words[word]);
/*    String [] wordSplit = userWord.split("");
    String [] wordRobotSplit = robotWord.split("");
        System.out.println(userWord.length());
        for (int i = 0; i < userWord.length(); i++) {
            if (wordSplit[i] == wordRobotSplit[i]){
//            }
//            if (userWord.charAt(i) == robotWord.charAt(i)) {
////          exitWord.charAt(i) = robotWord.charAt(i);
              System.out.println("good");
              break;
            }
            System.out.println(Arrays.toString(wordSplit));
        }*/
//    }
//    while ()

//    for (int i = 0; i < words.length; i++) {
//        int word = random.nextInt(words.length);
//        System.out.println(word);
//    }
        int z;
        do {
            System.out.println("Угадай слово");
            String userWord = sc.next();
            int k = 0;
            z = 0;

            if (robotWord.length() <= userWord.length()) {

            for (int i = 0; i < robotWord.length(); i++) {
                if (robotWord.charAt(i) == userWord.charAt(i)) {
                    z++;
                    System.out.print(robotWord.charAt(i));
                } else {
                    System.out.print("#");
                }
                k++;
            }
            }
            else
            {
                for (int i = 0; i < userWord.length(); i++) {
                   if (robotWord.charAt(i) == userWord.charAt(i)) {
                        z++;
                        System.out.print(robotWord.charAt(i));
                    } else {
                        System.out.print("#");

                    }
                    k++;
                }
            }
            if (z!=robotWord.length()){
            for (int i = 0; i < 15 - k; i++) {
                System.out.print("#");
            }}
//            System.out.println(z+" "+robotWord.length());
        } while (z != robotWord.length());
    }
}




