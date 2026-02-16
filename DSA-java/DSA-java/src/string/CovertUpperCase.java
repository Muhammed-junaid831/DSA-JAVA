package dsa.basic.string;

import java.util.Scanner;

public class CovertUpperCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String : ");
        String str = sc.nextLine();

        System.out.println(str.toUpperCase());
        sc.close();
    }
}
