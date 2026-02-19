package dsa.basic.array;

import java.util.Scanner;

public class SecondLargest {
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
                int largest = arr[0];
                for(int i=0;i<arr.length;i++){
                    if(arr[i] > largest){
                        largest = arr[i];
                    }
                }
                int slargest = -1;
                for(int i=0;i<arr.length;i++){
                    if(arr[i] > slargest && arr[i] != largest ){
                        slargest = arr[i];
                    }
                }
                System.out.println("Second largest : " +slargest );
            }
        }
