//Take a temperature value and print “Cold”, “Warm”, or “Hot” using range conditions.
package dsa.simple.conditions;

import java.util.Scanner;

public class TemperatureRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Temp : ");
        int temp = sc.nextInt();

        if(temp <= 10){
            System.out.println("Cold");
        }else if(temp < 25){
            System.out.println("Warm");
        }else{
            System.out.println("Hot");
        }
        sc.close();
    }
}
