/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.lab3;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author TUONG VY
 */
public class Sapxep1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so phan tu n: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            a[i] = sc.nextInt();
        }

        System.out.print("Nhap x: ");
        int x = sc.nextInt();

        boolean timThay = false;

        System.out.printf("Vi tri cua %d trong mang: ", x);

        for (int i = 0; i < n; i++) {
            if (a[i] == x) {
                System.out.printf("%d ", i);
                timThay = true;
            }
        }

        if (timThay == false) {
            System.out.printf("Khong tim thay");
        }

        System.out.printf("%n");

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (a[j] < a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        System.out.printf("Mang giam dan (Bubble Sort): %s%n",
                Arrays.toString(a));

        int[] b = Arrays.copyOf(a, a.length);

        Arrays.sort(b);

        System.out.printf("Mang tang dan (Arrays.sort): %s%n",
                Arrays.toString(b));

        sc.close();
    }
    
}
