//Check if a number is divisible by 5.
package dsa.simple.conditions;

import java.util.Scanner;

public class NumberDivisible {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        if(num % 5 == 0){
            System.out.println("Divisible by 5");
        }else{
            System.out.println("Not Divisible by 5");
        }
    }
}
