package com.bridgelabz.basiccoreprograms;

import java.util.Scanner;

public class CheckVowelAndConsonant {
    public static void main(String[] args) {
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character to check wether it is vowel or consonant");
        ch=sc.next().charAt(0);

        switch (ch){
            case 'a':
                System.out.println(ch +" is vowel");
                break;
            case 'e':
                System.out.println(ch +" is vowel");
                break;
            case 'i':
                System.out.println(ch +" is vowel");
                break;
            case 'o':
                System.out.println(ch +" is vowel");
                break;
            case 'u':
                System.out.println(ch +" is vowel");
                break;
            default:
                System.out.println(ch +" is consonant");
        }
    }
}
