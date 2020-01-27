package com.backend;

import java.util.Scanner;

public class Conditional {

    public static void main(String[] args) {
//        boolean number = true;
//        if (!number) {
//            System.out.println("Ganjil");
//        } else {
//            System.out.println("Genap");
//        }
//
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Nomor 1 : ");
//        int number1 = scan.nextInt();
//        System.out.println("Nomor 2 : ");
//        int number2 = scan.nextInt();
//        System.out.println("hasil : " + (number1 + number2));
//
//
//        int value1 = 5;
//        int value2 = 10;
//        String check = (value1 < value2) ? "Value 1 lebih kecil dari value 2" : "Value 1 lebih besar dari value 2";
//        System.out.println(check);

        System.out.println("============== Pengulangan For ==============");
        for (int i = 1; i< 10; i=i+2) {
            System.out.print(i);
            System.out.print(" ");
        }

        System.out.print("\n=========== Pengulangan While =============\n");
        int angka = 1;
        while (angka < 10) {
            System.out.println(angka);
            angka = angka + 2;
        }

        /*
            for (awal ; akhir; step) {
                logic
            }

            awal

            while (akhir) {

                logic

                step
            }
         */
    }
}

/*

    Tugas :

    Membuat kalkulator dengan looping dan conditional.

    misal:
    maksimal inputan 100 X.
    kalau user input = -999 -> close (break).
    kalau tidak, lanjut terus sampai 100 kali.

    input 1 : 5
    input 2 : 20
    operator : +  (bisa juga operator matematika yang lain)
    hasil : 25

    dikumpul hari selasa malam.
 */
