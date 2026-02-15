package dsa.basic.array;

import java.util.Scanner;

public class ArrayMaximum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size");
        int size = sc.nextInt();

        int arr[] = new int[size];


        System.out.println("Enter  elements");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for(int i=0;i<size;i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("maximum is  : "+max);
        sc.close();
}
}
