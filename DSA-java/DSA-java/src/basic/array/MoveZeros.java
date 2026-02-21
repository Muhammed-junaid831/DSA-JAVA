package dsa.basic.array;

import java.util.Scanner;

public class MoveZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter  elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }


        
        int i =0;
            for(int j=1;j<arr.length;j++){
            if(arr[j] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }
        for(int num : arr){
            System.out.println(num);
        }
    }
}
