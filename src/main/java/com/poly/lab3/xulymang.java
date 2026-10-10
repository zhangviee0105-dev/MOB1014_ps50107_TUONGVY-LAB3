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
public class xulymang {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Nhap so phan tu
        int n;

        do {
            System.out.printf("Nhap so phan tu n: ");
            n = sc.nextInt();
        } while (n <= 0);

        // Tao mang
        int[] a = new int[n];

        // Nhap mang
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhap a[%d]: ", i);
            a[i] = sc.nextInt();
        }

        // 1. Xuat mang
        System.out.printf("Mang vua nhap: ");

        for (int i = 0; i < n; i++) {
            System.out.printf("%d ", a[i]);
        }

        System.out.printf("\n");
        System.out.printf("Cac phan tu chan: ");

        int coChan = 0;

        for (int i = 0; i < n; i++) {

            if (a[i] % 2 != 0) {
                continue;
            }

            System.out.printf("%d ", a[i]);
            coChan = 1;
        }

        if (coChan == 0) {
            System.out.printf("Khong co phan tu chan");
        }

        System.out.printf("\n");

        // 3. Tong cac phan tu chia het cho 4
        int tong = 0;

        for (int i = 0; i < n; i++) {

            if (a[i] % 4 == 0) {
                tong = tong + a[i];
            }
        }

        System.out.printf("Tong cac so chia het cho 4: %d\n", tong);

        // 4. Tim gia tri lon nhat
        int max = a[0];

        for (int i = 1; i < n; i++) {

            if (a[i] > max) {
                max = a[i];
            }
        }

        System.out.printf("Gia tri lon nhat: %d\n", max);
    }
}  

