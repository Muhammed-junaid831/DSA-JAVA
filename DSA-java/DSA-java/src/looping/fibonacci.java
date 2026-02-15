package dsa.looping;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = sc.nextInt();

        int a = 0;
        int b = 1;

        for (int i = 2; i <= num; i++) {
            int c = a + b;
            System.out.println(c);

            a = b;
            b = c;
        }
    }
}
