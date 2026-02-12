//Check if a given year is a leap year

package dsa.simple.conditions;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year : ");
        int year = sc.nextInt();

        if(year % 400 == 0 || year % 4 == 0 && !(year % 100 ==0)){
            System.out.println("leap year");
        }else{
            System.out.println("non leap year");
        }
        sc.close();
    }
}


//A year is a leap year if:
//✅ Divisible by 400
//OR
//✅ Divisible by 4 but NOT divisible by 100