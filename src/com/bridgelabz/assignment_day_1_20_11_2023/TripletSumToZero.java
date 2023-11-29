package com.bridgelabz.assignment_day_1_20_11_2023;

import java.util.Arrays;
import java.util.Scanner;

public class TripletSumToZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int count = 0;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
               for(int k=j+1;k<n;k++){
                   if(arr[i]+arr[j]+arr[k] == 0){
                       System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
                       count++;
                   }
               }
            }
        }
        System.out.println(count);


    }
}
