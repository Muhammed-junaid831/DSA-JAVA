//Take a character and check whether it’s uppercase, lowercase, a digit, or a special
//character.

package dsa.simple.conditions;

import java.util.Scanner;

import static java.lang.Character.*;

public class CheckingChar {
    public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Alphabet");
        char ch = sc.next().charAt(0);

        if(isLowerCase(ch)){
          System.out.println(ch+" is lower case");
        }else if(isUpperCase(ch)){
            System.out.println(ch+" is Upper case");
        }else if(isDigit(ch)){
            System.out.println(ch+" is Digit");
        }else{
            System.out.println("Special Character");
        }
        sc.close();
    }
}
