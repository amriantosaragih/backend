package com.backend;

import java.util.Date;

public class Buku {
    private String judulBuku;
    private String namaPenulis;
    private String penerbit;
    private Date tanggalTerbit;
    private int jumlahHalaman;

    public Buku() {

    }

    public Buku(String judulBuku, String namaPenulis, String penerbit, Date tanggalTerbit, int jumlahHalaman) {
        this.judulBuku = judulBuku;
        this.namaPenulis = namaPenulis;
        this.penerbit = penerbit;
        this.tanggalTerbit = tanggalTerbit;
        this.jumlahHalaman = jumlahHalaman;
    }

    public String getJudulBuku() {
        return judulBuku;
    }

    public void setJudulBuku(String judulBuku) {
        this.judulBuku = judulBuku;
    }

    public String getNamaPenulis() {
        return namaPenulis;
    }

    public void setNamaPenulis(String namaPenulis) {
        this.namaPenulis = namaPenulis;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public Date getTanggalTerbit() {
        return tanggalTerbit;
    }

    public void setTanggalTerbit(Date tanggalTerbit) {
        this.tanggalTerbit = tanggalTerbit;
    }

    public int getJumlahHalaman() {
        return jumlahHalaman;
    }

    public void setJumlahHalaman(int jumlahHalaman) {
        this.jumlahHalaman = jumlahHalaman;
    }
}
