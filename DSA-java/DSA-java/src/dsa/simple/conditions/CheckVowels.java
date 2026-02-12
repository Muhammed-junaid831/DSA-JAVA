//Take a character and check if it’s a vowel or consonant.

package dsa.simple.conditions;

import java.util.Scanner;

public class CheckVowels {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Alphabet");
        char alphabet = sc.next().toLowerCase().charAt(0);

        if(alphabet =='a'||alphabet == 'e' || alphabet =='i' ||alphabet == 'o' ||alphabet =='u'){
            System.out.println("Vowels");
        }else{
            System.out.println("Consonant");
        }
        sc.close();
    }
}
