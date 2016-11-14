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
public class TransaksiBelanja {
    private String nama,tanggal;
    private int idBelanja,harga,jumlah,total;

    public TransaksiBelanja(String nama, String tanggal, int harga, int jumlah, int total) {
        this.nama = nama;
        this.tanggal = tanggal;
        this.harga = harga;
        this.jumlah = jumlah;
        this.total = total;
    }

    public TransaksiBelanja(String nama, String tanggal, int idBelanja, int harga, int jumlah, int total) {
        this.nama = nama;
        this.tanggal = tanggal;
        this.idBelanja = idBelanja;
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

    public int getIdBelanja() {
        return idBelanja;
    }

    public void setIdBelanja(int idBelanja) {
        this.idBelanja = idBelanja;
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
