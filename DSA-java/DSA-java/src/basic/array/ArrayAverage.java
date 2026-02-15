package dsa.basic.array;

import java.util.Scanner;

public class ArrayAverage {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size");
        int size = sc.nextInt();

        int arr[] = new int[size];

        int sum = 0;

        System.out.println("Enter  elements");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            sum = sum +arr[i] / size ;

        }
        System.out.println("The Average of an array is : "+sum);
        sc.close();
    }
}
