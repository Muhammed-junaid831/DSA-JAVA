package dsa.basic.array;

import java.util.Scanner;

public class ArrayCount {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size");
        int size = sc.nextInt();

        int arr[] = new int[size];

        int positiveCount = 0;
        int negativeCount =0;
        int zeroCount = 0;

        System.out.println("Enter  elements");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<size;i++){
            if(arr[i] == 0){
                zeroCount++;
            }else if(arr[i] < 0){
                negativeCount++;
            }else{
                positiveCount++;
            }

        }
        System.out.println("zeroCount : "+zeroCount+"\n"+"negativeCount : "+negativeCount+"\n"+"positiveCount : "+positiveCount);
        sc.close();
    }
}

