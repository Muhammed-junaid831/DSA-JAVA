package dsa.simple.conditions;

import java.util.Scanner;

public class MultipleOf {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num1 : ");
        int a = sc.nextInt();
        System.out.println("Enter a num2 : ");
        int b = sc.nextInt();

        if(a==0 || b==0){
            System.out.println("Cannot determine multiple (zero involved)");
        }else if(a % b == 0 || b % a == 0){
            System.out.println("One number is a multiple of the other");
        }else{
            System.out.println("Not multiples");
        }
        sc.close();
    }
}
