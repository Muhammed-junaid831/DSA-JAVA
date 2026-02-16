package dsa.basic.string;

import java.util.Scanner;

public class FirstLastChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String : ");
        String str = sc.nextLine();

        if (str.length() > 0) {
            char first = str.charAt(0);
            char last = str.charAt(str.length() - 1);

            System.out.println(str.charAt(0));
            System.out.println(str.charAt(str.length()- 1));
        }else{
            System.out.println("Empty");
        }
    }
}
