package com.backend;

import java.util.ArrayList;
import java.util.List;

public class App
{
    public static void main(String[] args) {
//        String hasil = run2(20);
//        isGenap(hasil);

//        List array = array1Dim();
//        for (int i=0; i<array.size(); i++) {
//
//            System.out.println("Hasil array "+ i + " = " + array.get(i));
//        }
//
//        String[][] arr = array2Dim();
//        for (int i=0; i<2; i++) {
//            for (int j=0; j<3; j++) {
//                System.out.println(arr[i][j]);
//            }
//        }
        looping();
    }

/*

     *
     **
     ***
     ****

     ****
     ***
     **
     *

         *
        **
       ***
      ****

 */

    public static void looping() {
        for (int i=0; i<3; i++) {    // -> (N^3)
            for (int j=0; i<3; j++) {  // -> (N^2)
                for (int k=0; k<3; k++) {  // karena batasan nya tidak ditemukan
                    System.out.println("i " + i);
                    System.out.println("J " + j);
                    System.out.println("K " +k);
                }
            }
            for (int k=0; k < 3; k++) {
                // kompleksitas algoritma
            }
        }
    }

    public static String[][] array2Dim() {
        String[][] arr2 = {
                {"1", "2", "3"},
                {"3", "4", "1"}
        };
        return arr2;
    }

    public static List array1Dim() {
        String[] nama = {"aa", "ab", "ac"};
        List listNama = new ArrayList();
//        listNama.add("aa");
//        listNama.add("ab");
//        listNama.add("ac");
        Person person = new Person("amri", 25, "kalibata");
        listNama.add(person);
        listNama.add("aaaa");
        listNama.add(67);
        String check = listNama.get(0).equals("aaaa") ? "True" : "False";
        System.out.println(check);
//        nama[1] = "ad";
        return listNama;
    }

    /*
    i=0
    while (i<3) {


        i=i+1
    }


    do {

    } while()

     */

    public static String run2(int number1) {
        if (number1 % 2 == 0) {
            return "genap";
        } else if(number1 > 0){

        }else {
            return "ganjil";
        }
        return "";
    }

    public static void isGenap (String number) {
        switch (number) {
            case "genap":
                System.out.println("switch ini genap");
            case "ganjil":
                System.out.println("switch ini ganjil");
        }
    }

    public static void run() {
        Person person = new Person();
        System.out.println(person);
        Person person1 = new Person("amri", 25, "kalibata", "laki-laki", "IT", "amri@gmail.com", 0.0);
        System.out.println("Nama saya : " + person1.getNama());
        System.out.println("alamat : " + person1.getAlamat());
        Person person2 = new Person("amri", 25, "kalibata");
        System.out.println("Jenis Kelamin : "+person2.getJenisKelamin());


        // Kondisional

//        int nilai1 = 10;
//        int nilai2 = 100;
//
//        if (nilai1 == 10 && nilai1 != nilai2) {
//            System.out.println("Masuk pak eko");
//        }
//
//        int nilai3 = 10;
//        String nilai4 = "20";

//        if (nilai3 == 10, nilai3 != nilai4) {
//
//        }

//        double num1 = 5.2;
//        int num2 = 5;
//
//        if (num1 == num2) {
//
//        }
//
//        String nama1 = "aaa";
//        String nama2 = "aaa";
//        if (nama1 == nama2) {
//
//        }


    }
}
/*

Operator
   +, - , / (bagi), *, &&, ||, ==, =, %, a**b (pangkat), >, <, != (tidak sama dengan), ++, --, -=, +=

 a-=5   ->  a = a - 5
 a+=5   ->  a = a + 5
 a++    ->  a = a + 1
 a--    ->  a = a - 1
 */

/*
    if (nilai1 != 5 && nilai2 == 1, nilai3 >= 10 && nilai3 < 20){   // 10 <= nilai3 <= 19

    }
 */

/*
String -> abjad, punya tanda petik dua, tanda tanya
int, long -> number, tidak bilangan pecahan
float, double -> number, bilangan pecahan
boolean -> antara true dan false,

 */


/*
kumpulan logic, sebagai pengeksekusi perintah
    - method
    - function

untuk sebuah method
    - akses modifier
    - tipe data kembalian
    - nama method
 */


/*
untuk projek dalam bahasa java

1. class
2. main

 */

/*
untuk 1 class

1. variable
2. method
3. constructor

 */

/*
untuk 1 variable
    - tipe data
    - nama variable
    - access modifier
 */

/*
Access modifier
   - public  -> bisa diakses oleh semua folder
   - protected -> hanya bisa diakses oleh file yang ada dalam 1 folder
   - private  -> hanya bisa diakses oleh file tersebut
 */

/*
Kondisional

If, else
switch, case
ada di setiap operator yang berhubungan dengan kondisional
==, !=, &&, ||

 */


/*
    Tugas
    membuat aplikasi tentang derajat

    1. lebih kecil dari 0   -> print beku
    2. antara 0 dan 30  -> print dingin
    3. antara 31 dan 60 -> print hangat
    4. antara 61 dan 100 -> print panas
    5. lebih besar dari 101 -> is a hell (meleleh)
 */