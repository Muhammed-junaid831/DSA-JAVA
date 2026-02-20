package dsa.basic.array;

import java.util.Scanner;

public class MaxConsecuitve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size");
        int size = sc.nextInt();

        int arr[] = new int[size];

       int Count = 0;
       int max = 0;

        System.out.println("Enter  elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 1){
                Count++;
                max = Math.max(max,Count);
            }else{
                Count = 0;
            }
        }
        System.out.println("Maximum is : "+max);
    }
}
