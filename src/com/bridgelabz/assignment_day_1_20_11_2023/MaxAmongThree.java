package com.bridgelabz.assignment_day_1_20_11_2023;
import java.util.Scanner;

public class MaxAmongThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int maxVal = A > B ? A : B;
        maxVal = maxVal > C ? maxVal : C;
        System.out.println("Max among all: " + maxVal);
    }
}
