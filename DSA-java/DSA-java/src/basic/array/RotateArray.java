package dsa.basic.array;

import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size");
        int size = sc.nextInt();

        int arr[] = new int[size];

        int sum = 0;

        System.out.println("Enter  elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int temp = arr[0];

        for(int i=1;i<arr.length;i++){
            arr[i-1] = arr[i];
        }

        arr[arr.length - 1] = temp;

        for(int num : arr){
            System.out.println(num +" ");
        }
    }
}
