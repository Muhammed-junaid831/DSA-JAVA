package dsa.basic.array;

import java.util.Scanner;

public class RotateNElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size");
        int size = sc.nextInt();

        int arr[] = new int[size];


        System.out.println("Enter  elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter K value : ");
          int k = sc.nextInt();

           k = k % arr.length;   //

          int temp[] = new int[k];

          for(int i =0; i<k; i++){               // Storing the values
              temp[i] = arr[i];
          }
          for(int i = k ; i<arr.length;i++){         // shifting the values
              arr[i-k] = arr[i];
          }
          for(int i = arr.length - k ; i < arr.length;i++){     //printing the values
              arr[i] = temp[i - (arr.length - k)];
          }
          for(int num : arr){
              System.out.println(num+" ");
          }
          sc.close();
    }
}
