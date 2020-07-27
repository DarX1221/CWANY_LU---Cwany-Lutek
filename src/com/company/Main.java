package com.company;

import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {

        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scan.nextInt();
            int k = scan.nextInt();

            if (n < k) {
                System.out.println("P");
            } else {

                if (Lagrange(n) > Lagrange(k) + Lagrange(n - k)) {
                    System.out.println("P");
                } else {
                    System.out.println("N");
                }
            }
        }
    }

    public static long Lagrange(int n) {
        long wykladnik = 0;
        long w = 2;

        while (n / w >= 1) {
            wykladnik += n / w;
            w *= 2;
        }
        return wykladnik;
    }
}
