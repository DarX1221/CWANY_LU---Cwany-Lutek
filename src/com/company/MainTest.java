package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void test1() {
        long nL = Lagrange(100);
        long kL = Lagrange(2);
        long nkL = Lagrange(100 - 2);
        assertTrue(nL > kL + nkL);
    }

    @Test
    void test2() {
        long nL = Lagrange(7);
        long kL = Lagrange(7);
        long nkL = Lagrange(0);
        assertFalse(nL > kL + nkL);
    }

    @Test
    void test3() {
        long nL = Lagrange(19);
        long kL = Lagrange(9);
        long nkL = Lagrange(19 - 9);
        assertTrue(nL > kL + nkL);
    }


    public static long Lagrange(int n) {
        long wykladnik = 0;
        long w = 2;

        while(n/w >= 1) {
            wykladnik += n/w;
            w *= 2;
        }
        return wykladnik;
    }

}