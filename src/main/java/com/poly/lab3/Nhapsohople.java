/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.lab3;
import java.util.Scanner;

/**
 *
 * @author TUONG VY
 */
public class Nhapsohople {
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
       // System.out.print("Nhap so nguyen: ");
        int n ;
        int dem =0;
        do{
            System.out.print("Nhap so nguyen: ");
            n = sc.nextInt();
            dem ++;
             if (!(n > 0 && n % 3 == 0 && n % 5 == 0)) 
            {
            System.out.printf("So khong hop le moi nhap lai !\n");           
        }
             
        }
        while (!(n > 0 && n % 3 == 0 && n % 5 == 0));
        System.out.printf("So hop le :%d (sau %d lan nhap)\n",n,dem);
}

        
    
    
}
