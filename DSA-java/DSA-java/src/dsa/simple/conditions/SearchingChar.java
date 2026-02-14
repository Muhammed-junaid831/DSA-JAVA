package dsa.simple.conditions;

import java.util.Scanner;

public class SearchingChar {
    public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Alphabet");
        char ch = sc.next().charAt(0);

        if((ch >= 'a' && ch <= 'm') || (ch >= 'n' && ch <= 'z')){
            System.out.println("Character lies between a–m or n–z");
        }else{
            System.out.println("Not a valid alphabet");
        }
    }
}
