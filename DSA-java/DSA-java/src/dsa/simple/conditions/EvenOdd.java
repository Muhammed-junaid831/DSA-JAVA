//Check if a number is even or odd

package dsa.simple.conditions;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        if(num % 2 == 0){
           System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
        sc.close();
    }
}
