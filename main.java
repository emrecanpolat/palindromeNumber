package com.company;



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String args[]) {

        isPalindrome(30000003);

    }
// i 393
    // r = 3
    //i = 39 r = 39
    //r=393
    public static void isPalindrome(long i){
        long reversed_i = 0;
        long b = i;
        while (b>0){
            reversed_i = reversed_i * 10 + b % 10;
            b = b / 10;
        }
        if (reversed_i==i){
            System.out.println("Palindrome");
        }else {
            System.out.println("not palindrome");
        }

    }




}
