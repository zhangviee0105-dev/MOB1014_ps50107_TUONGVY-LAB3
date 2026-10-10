/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.poly.lab3;
import java.util.Scanner;

/**
 *
 * @author TUONG VY
 */
public class LaB3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap n: ");
        int n = sc.nextInt();
        int tong = 0;
        int dem =0;
        System.out.print("Cac so chia het cho 3: \n");
        for (int i =1;i<=n;i++){
            if (i%3==0){
                System.out.print(i+" ");
                tong += i;
               
                dem++;
            }
        }
        System.out.printf("Trung binh cong : %.2f", (double)tong/dem);
        
        
        
    
    }
}
