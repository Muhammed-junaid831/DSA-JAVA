package dsa.looping;

import java.util.Scanner;

public class Amstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = sc.nextInt();

        int count = 0;
        int original = num;
        int temp = num;
        int sum = 0;

        while (temp > 0) {
            count++;
            temp = temp / 10;
        }

        temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, count);
            temp = temp / 10;
        }

        if (sum == original) {
            System.out.println("Armstrong");
        } else {
            System.out.println("not an Armstrong");
        }
    }
}








