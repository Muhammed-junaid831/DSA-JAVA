//. Print the sum of all even numbers up to n.
package dsa.looping;

import java.util.Scanner;

public class SumOfEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = sc.nextInt();

        int sum =0;

        if(num == 0){
            System.out.println("please Enter a valid number ");
            return;
        }

            for(int i =0 ;i <= num ; i++){
                if(i % 2 == 0){
                    sum=sum+i;
            }
        }

        System.out.println("Sum of even numbers = " + sum);
            sc.close();
    }
}