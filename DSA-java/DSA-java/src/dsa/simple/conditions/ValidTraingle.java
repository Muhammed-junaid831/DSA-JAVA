package dsa.simple.conditions;

import java.util.Scanner;

public class ValidTraingle {
    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);

        System.out.print("Enter a  : ");
        int a = sc.nextInt();

        System.out.print("Enter b  : ");
        int b = sc.nextInt();

        System.out.print("Enter c  : ");
        int c = sc.nextInt();

        if(a <= 0 || b <= 0 || c <= 0){
            System.out.println("Invalid triangle");
        }
        
        if(a + b > c && a + c > b && b + c > a ){
           System.out.println("valid traingle ");
        }else{
            System.out.println("Invalid triangle");
        }
        sc.close();
  }
}
