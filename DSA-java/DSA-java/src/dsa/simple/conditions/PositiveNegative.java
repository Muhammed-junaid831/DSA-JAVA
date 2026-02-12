//Take a number and print whether it is positive neagative or Zero

package dsa.simple.conditions;

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        if(num > 0){
            System.out.println("Positive");
        }else if (num < 0){
            System.out.println("Negative");
        }else{
            System.out.println("zero");
        }
    }
}
