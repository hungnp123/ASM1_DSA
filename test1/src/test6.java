
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
import java.util.Scanner;
 
 
public class test6 {
 
    public static void main(String[] args) {
         
        float sum = 0;
        int n;
        Scanner sc;
        do {
            System.out.println("Nhập n = ");
            sc = new Scanner(System.in);
            n = sc.nextInt();
        }while(n <= 0);
         
        for(int i = 1; i <= n; i++) {
            sum += 1.0/i;
        }
         
        System.out.println("S = " + sum);
        sc.close();
    }
}
