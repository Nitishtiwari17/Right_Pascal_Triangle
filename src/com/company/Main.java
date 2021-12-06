package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int i, j, row;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of row you want to print");
        row = sc.nextInt();
        for (i = 0; i < row - 1; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println("");
        }
        for (i = row - 1; i >= 0; i--) {

            for (j = 0; j <= i - 1; j++) {
                System.out.print("*" + " ");
            }
            System.out.println("");
            // write your code here
        }
    }
}

