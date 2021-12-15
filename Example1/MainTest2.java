package Example1;

import java.util.Scanner;

public class MainTest2 {
    static Scanner sc;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        String text = sc.next();
        System.out.printf("Привет %s, как дела %s", text, text);
    }
}
