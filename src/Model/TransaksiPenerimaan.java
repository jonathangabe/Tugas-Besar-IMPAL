/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author UPC
 */
public class TransaksiPenerimaan {
    private String nama,tanggal;
    private int idPenerimaan,harga,jumlah,total;

    public TransaksiPenerimaan(String nama, String tanggal, int harga, int jumlah, int total) {
        this.nama = nama;
        this.tanggal = tanggal;
        this.harga = harga;
        this.jumlah = jumlah;
        this.total = total;
    }

    public TransaksiPenerimaan(String nama, String tanggal, int idPenerimaan, int harga, int jumlah, int total) {
        this.nama = nama;
        this.tanggal = tanggal;
        this.idPenerimaan = idPenerimaan;
        this.harga = harga;
        this.jumlah = jumlah;
        this.total = total;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public int getIdPenerimaan() {
        return idPenerimaan;
    }

    public void setIdPenerimaan(int idPenerimaan) {
        this.idPenerimaan = idPenerimaan;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    
    
}
