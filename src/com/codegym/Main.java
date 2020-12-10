package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số cần kiểm tra:");
        int number = sc.nextInt();

        if (number<2){
            System.out.println(number + " is not a prime");
        }else {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(number)) {
                if (number % 2 == 0) {
                    check = false;
                    break;
                }i++;
            }
            if (check){
                System.out.println(number + " is a prime");
            }else System.out.println(number+ " is a not prime");
        }
    }
}
