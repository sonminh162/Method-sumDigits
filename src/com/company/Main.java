package com.company;

import java.util.Scanner;

public class Main {
    public static long sum(long n){
        long sum =0 ;
        while(n !=0){
            if(n%10==0){
                sum+=((n/10)%10);
                n = n/10;
            }
            else{
                sum+=(n%10);
                n = n/10;
            }
        }

        return sum;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        long number;
        System.out.print("Nhap vao so nguyen:");
        number = scanner.nextLong();
        System.out.print("Tong cac chu so cua so nguyen la:"+sum(number));
    }
}
