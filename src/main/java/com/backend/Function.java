package com.backend;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Function {
    private int nomor1;
    private int nomor2;

    public Function (int nomor1, int nomor2) {
        this.nomor1 = nomor1;
        this.nomor2 = nomor2;
    }

    public int getNomor1 () {
        return nomor1;
    }

    public void setNomor1 (int nomor1) {
        this.nomor1 = nomor1;
    }

    public int perkalian() {
        return this.nomor1 * this.nomor2;
    }

    public int pembagian() {
        if (this.nomor2 != 0) {
            return this.nomor1 / this.nomor2;
        } else if (this.nomor2 == 0) {
            System.out.println("nomor 0");
        } else {
            System.out.println("Nomor pembagi yang anda masukkan tidak boleh sama dengan 0");
            return 0;
        }



//        try {
//            return this.nomor1 / this.nomor2;
//        } catch (ArithmeticException ae) {
//            return 0;
//        }
    }

    public int checkNomor (int inputNomor) {
        if (inputNomor > 0) {
            return inputNomor;
        } else {
            System.out.println("Nomor yang anda masukkan tidak boleh lebih kecil atau sama dengan dari 0");
            return 0;
        }
    }

    public void getPersonData(Person person) {
        if (person != null) {
            if (person.getNama() != null) {
                System.out.println(person.getNama());
            } else {
                System.out.println("Nama nya kosong");
            }
            if (person.getAlamat() != null) {
                System.out.println(person.getAlamat());
            }
        } else {
            System.out.println("Data person tidak ada");
        }
    }


    public void addDataBuku() {
        List<Buku> data = new ArrayList<>();
        Buku buku = new Buku("matematika", "andi", "erlangga", new Date(), 110);
        Buku buku1 = new Buku ("fisika", "andin", "erlangga", new Date(), 140);
        data.add(buku);
        data.add(buku1);
        for (int i=0; i< data.size(); i++) {
            System.out.println("print data buku ke-" + (i+1));
            System.out.println("judul buku : " + data.get(i).getJudulBuku());
            System.out.println("nama penulis : " + data.get(i).getNamaPenulis());
            System.out.println("penerbit : " + data.get(i).getPenerbit());
            System.out.println("===================");
        }
    }

}


class main {
    private static int nomor1;
    public static void main(String[] args) {
        Function function = new Function(64, 8);
//        int nomor1 = 8;
//        main.nomor1 = nomor1;
//        System.out.println(main.nomor1);
//        System.out.println(function.perkalian());
//        System.out.println(function.pembagian());
//
//        System.out.println(function.checkNomor(4));
//        Person person = new Person("amri");
        Person person = new Person();
        function.getPersonData(person);
        function.addDataBuku();
    }
}
