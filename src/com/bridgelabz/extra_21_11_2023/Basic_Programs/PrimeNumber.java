package com.bridgelabz.extra_21_11_2023.Basic_Programs;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n == 1){
            System.out.println("Not a Prime.");
            return;
        }
        if(n == 2){
            System.out.println("is Prime.");
            return;
        }
        for(int i=3;i*i<=n;i++){
            if(n%i == 0){
                System.out.println("Not a Prime.");
                return;
            }
        }
        System.out.println("is Prime");
    }
}
