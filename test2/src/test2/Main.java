/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test2;

import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) {
         
        float sum = 0;
        int n;
        Scanner sc;
        do {
            System.out.println("Input n = ");
            sc = new Scanner(System.in);
            n = sc.nextInt();
        }while(n <= 0);
         
        for(int i = 1; i <= n; i++) {
            sum += 1.0/i;
        }
         
        System.out.println("1+ 1/2+ 1/3+ ...+1/n = " + sum);
        sc.close();
    }
}