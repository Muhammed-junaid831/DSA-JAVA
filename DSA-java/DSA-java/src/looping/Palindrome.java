//Check if a number is a palindrome
package dsa.looping;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = sc.nextInt();

        int reverse =  0 ;
        int original = num;

        while(num > 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;

        }
        System.out.println(reverse);

            if(original == reverse){
                System.out.println("palindrome");
            }else{
                System.out.println("not a palindrome");
            }
    }
}
