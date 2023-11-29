package com.bridgelabz.extra_21_11_2023.Basic_Programs;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int reversedNum = 0;
        int pow = 0;
        int temp = n;
        while (temp > 0) {
            reversedNum += (temp % 10) * (int) Math.pow(10, pow++);
            temp /= 10;
        }
        if(n == reversedNum){
            System.out.println("Given number is palindrome.");
        }else{
            System.out.println("Given number is not palindrome.");
        }
    }
}
