package dsa.basic.array;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter a Elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Set<Integer> set = new HashSet<>();

        for(int i=0;i<arr.length;i++) {
            set.add(arr[i]);
        }
            System.out.println(set);
        }
    }
