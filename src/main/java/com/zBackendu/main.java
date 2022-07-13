package com.zBackendu;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        System.out.println("Wybierz 3 liczby które ulegną sortowaniu");
        System.out.println("\n");

        Scanner kod = new Scanner(System.in);

        System.out.println("Podaj liczbę nr 1:");
        int a = kod.nextInt();

        System.out.println("Podaj liczbę nr 2:");
        int b = kod.nextInt();

        System.out.println("Podaj liczbę nr 3:");
        int c = kod.nextInt();

        if (a > b && a > c) {
            System.out.println("\n\nNajwiększa liczba to " + a);
        } else if (b > a && b > c) {
            System.out.println("\n\nNajwiększa liczba to " + b);
        } else if (c > a && c > b) {
            System.out.println("\n\nNajwiększa liczba to " + c);
        }
    }
}

